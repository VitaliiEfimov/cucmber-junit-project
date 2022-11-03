package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HioscarPage extends BasePage {

    @FindBy(xpath = "//div[@class='Button_content__yNdi7']")
    public WebElement SearchNetworkBtn;

    @FindBy(xpath = "//div[@class='Dropdown_visibleContent__NGHUm']")
    public WebElement coverageYearSelectOpt;

    @FindBy(xpath = "//div[@aria-label='2023']")
    public WebElement option2023;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[2]")
    public WebElement coverageAccessSelectOpt;

    @FindBy(xpath = "(//div[@class='DropdownOverlayItem_item__36OV6 DropdownOverlayItem_item_size-small__3eMNL'])[1]")
    public WebElement optionEmployerProvider;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")
    public WebElement networkPartnerSelectOpt;

    @FindBy(xpath = "//div[@aria-label='Oscar']")
    public WebElement optionOscar;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[4]")
    public WebElement coverageAriaSelectOpt;

    @FindBy(xpath = "//div[@aria-label='New Jersey']")
    public WebElement newJerseySelectOpt;

    @FindBy(xpath = "(//button[@class='Button_buttonBase__26hAr Button_filled__1Lgot Button_button_primary__1BOBS Button_button_medium__2_2dm NetworkSelector_buttonSubmit__l3NsD'])[1]")
    public WebElement continueBtn;
}
