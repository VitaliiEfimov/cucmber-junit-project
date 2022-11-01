package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackLoginPage extends BasePage {
    @FindBy(id = "prependedInput")
    public WebElement inputLogin;

    @FindBy (id = "prependedInput2")
    public WebElement inputPassw;

    @FindBy (id = "_submit")
    public WebElement submitBtn;
}
