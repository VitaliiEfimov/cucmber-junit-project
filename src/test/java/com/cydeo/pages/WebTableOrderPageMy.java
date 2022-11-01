package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTableOrderPageMy extends BasePage {

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//button[@class='button nav__item'])[2]")
    public WebElement orderBtn;

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productSelectBox;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement inputQuantity;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputCustomerName;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement inputStreet;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement inputCity;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement inputState;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement inputZip;

    @FindBy(xpath = "//input[@name='card']")
    public List<WebElement> inputCard;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement inputCardNumber;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement inputCardExp;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "(//table[@class='table is-fullwidth']//td[1])[1]")
    public WebElement nameCheck;
}
