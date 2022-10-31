package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WebTableOrder_StepDef {

    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/create-order");
        webTableOrderPage.inputUsername.sendKeys("Test");
        webTableOrderPage.inputPassword.sendKeys("Tester");
        webTableOrderPage.loginBtn.click();
        webTableOrderPage.orderBtn.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productSelectStr) {
        Select select = new Select(webTableOrderPage.productSelectBox);
        select.selectByVisibleText(productSelectStr);
    }

    @When("user enters quantity {string}")
    public void user_enters_quantity(String quantityStr) {
        webTableOrderPage.inputQuantity.sendKeys(Keys.BACK_SPACE + quantityStr);
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerNameStr) {
        webTableOrderPage.inputCustomerName.sendKeys(customerNameStr);
    }

    @When("user enters street {string}")
    public void user_enters_street(String streetStr) {
        webTableOrderPage.inputStreet.sendKeys(streetStr);
    }

    @When("user enters city {string}")
    public void user_enters_city(String cityStr) {
        webTableOrderPage.inputCity.sendKeys(cityStr);
    }

    @When("user enters state {string}")
    public void user_enters_state(String stateStr) {
        webTableOrderPage.inputState.sendKeys(stateStr);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcodeStr) {
        webTableOrderPage.inputZip.sendKeys(zipcodeStr);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardTypeStr) {

        for (WebElement webElement : webTableOrderPage.inputCard) {
            if (webElement.getAttribute("value").contains(cardTypeStr)) {
                webElement.click();
            }
        }
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumberStr) {
        webTableOrderPage.inputCardNumber.sendKeys(cardNumberStr);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expiryDateStr) {
        webTableOrderPage.inputCardExp.sendKeys(expiryDateStr);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.submitBtn.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedNameStr) {
        Assert.assertTrue(expectedNameStr.contains(webTableOrderPage.nameCheck.getText()));
//        Assert.assertEquals("WTO", expectedNameStr, webTableOrderPage.nameCheck.getText());

    }
}
