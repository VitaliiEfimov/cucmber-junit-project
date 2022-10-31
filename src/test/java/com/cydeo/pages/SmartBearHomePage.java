package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearHomePage extends BasePage {

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderBtn;
}
