package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BasePage {

    @FindBy(name = "ctl00$MainContent$username")
    public WebElement usernameBoxSmartBear;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement passwordBoxSmartBear;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginBtn;


}
