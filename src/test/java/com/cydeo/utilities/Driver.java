package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    // creating a private constructor, so we are closing access to the object of this class
    private Driver() {}



    // making our 'driver' instance private, so that it is not reachable from outside any class
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {

        //create re-usable utility method which will return same driver instance when we call it

        if (driverPool.get() == null) { //if driver/browser was never opened
            String browserType = ConfigurationReader.getProperty("browser");

             /*
        Depending on the browserType our switch statement will determine
        to open specific type of browser/driver
         */
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);break;
            }
        }
        // Same driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();
    }

    public static WebDriver getDriver2(int timeCapacity) {

        //create re-usable utility method which will return same driver instance when we call it

        if (driverPool.get() == null) { //if driver/browser was never opened
            String browserType = ConfigurationReader.getProperty("browser");

             /*
        Depending on the browserType our switch statement will determine
        to open specific type of browser/driver
         */
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
  //                  driver = new ChromeDriver();
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(timeCapacity, TimeUnit.SECONDS);break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(timeCapacity, TimeUnit.SECONDS);break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(timeCapacity, TimeUnit.SECONDS);break;
            }
        }
        // Same driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();
    }


    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().close();
            driverPool.remove();
        }
    }
}
