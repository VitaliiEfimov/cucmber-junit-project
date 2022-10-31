package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {

    public EtsySearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement etsySearchBox;

    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    public WebElement etsySearchBtn;
}
