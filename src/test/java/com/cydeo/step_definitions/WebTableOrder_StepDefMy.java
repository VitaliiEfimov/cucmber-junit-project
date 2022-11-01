package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableOrderPageMy;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDefMy {
//
//    WebTableOrderPageMy webTableOrderPageMy = new WebTableOrderPageMy();
//
//    @Given("user is already logged in and on order page")
//    public void user_is_already_logged_in_and_on_order_page() {
//        Driver.getDriver().get("https://web-table-2.cydeo.com/create-order");
//        webTableOrderPageMy.inputUsername.sendKeys("Test");
//        webTableOrderPageMy.inputPassword.sendKeys("Tester");
//        webTableOrderPageMy.loginBtn.click();
//        webTableOrderPageMy.orderBtn.click();
//    }
//
//    @When("user selects product type {string}")
//    public void user_selects_product_type(String productSelectStr) {
//        Select select = new Select(webTableOrderPageMy.productSelectBox);
//        select.selectByVisibleText(productSelectStr);
//    }
//
//    @When("user enters quantity {string}")
//    public void user_enters_quantity(String quantityStr) {
//        webTableOrderPageMy.inputQuantity.sendKeys(Keys.BACK_SPACE + quantityStr);
//    }
//
//    @When("user enters customer name {string}")
//    public void user_enters_customer_name(String customerNameStr) {
//        webTableOrderPageMy.inputCustomerName.sendKeys(customerNameStr);
//    }
//
//    @When("user enters street {string}")
//    public void user_enters_street(String streetStr) {
//        webTableOrderPageMy.inputStreet.sendKeys(streetStr);
//    }
//
//    @When("user enters city {string}")
//    public void user_enters_city(String cityStr) {
//        webTableOrderPageMy.inputCity.sendKeys(cityStr);
//    }
//
//    @When("user enters state {string}")
//    public void user_enters_state(String stateStr) {
//        webTableOrderPageMy.inputState.sendKeys(stateStr);
//    }
//
//    @When("user enters zipcode {string}")
//    public void user_enters_zipcode(String zipcodeStr) {
//        webTableOrderPageMy.inputZip.sendKeys(zipcodeStr);
//    }
//
//    @When("user selects credit card type {string}")
//    public void user_selects_credit_card_type(String cardTypeStr) {
//
//        for (WebElement webElement : webTableOrderPageMy.inputCard) {
//            if (webElement.getAttribute("value").contains(cardTypeStr)) {
//                webElement.click();
//            }
//        }
//    }
//
//    @When("user enters credit card number {string}")
//    public void user_enters_credit_card_number(String cardNumberStr) {
//        webTableOrderPageMy.inputCardNumber.sendKeys(cardNumberStr);
//    }
//
//    @When("user enters expiry date {string}")
//    public void user_enters_expiry_date(String expiryDateStr) {
//        webTableOrderPageMy.inputCardExp.sendKeys(expiryDateStr);
//    }
//
//    @When("user enters process order button")
//    public void user_enters_process_order_button() {
//        webTableOrderPageMy.submitBtn.click();
//    }
//
//    @Then("user should see {string} in first row of the web table")
//    public void user_should_see_in_first_row_of_the_web_table(String expectedNameStr) {
//        Assert.assertTrue(expectedNameStr.contains(webTableOrderPageMy.nameCheck.getText()));
////        Assert.assertEquals("WTO", expectedNameStr, webTableOrderPage.nameCheck.getText());
//
//    }
}
