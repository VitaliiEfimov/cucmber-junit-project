package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackOroincCheckAndHelpTextPage extends  BasePage{

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement questionIcon;

    @FindBy(xpath = "//div[@class='pin-bar-empty']//a")
    public WebElement linkLearnEtc;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement usePinBarMessage;

    @FindBy(xpath = "//div[@class=\"container-fluid\"]//div//p[1]")
    public WebElement usePinIcon;

    @FindBy(xpath = "//img[@style='box-shadow: 1px 0px 12px rgba(0,0,0,0.5)']")
    public WebElement pictureIsDisplayed;
}
