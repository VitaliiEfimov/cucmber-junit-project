package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearHomePage;
import com.cydeo.pages.SmartBearLoginPage;
import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrder {
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearLoginURL"));
        SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
        smartBearLoginPage.usernameBoxSmartBear.sendKeys(ConfigurationReader.getProperty("userName"));
        smartBearLoginPage.passwordBoxSmartBear.sendKeys(ConfigurationReader.getProperty("password"));
        smartBearLoginPage.loginBtn.click();
        SmartBearHomePage smartBearHomePage = new SmartBearHomePage();
        smartBearHomePage.orderBtn.click();
    }

    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select select = new Select(smartBearOrderPage.productSelect);
        select.selectByIndex(1);
    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearOrderPage.quantityBox.sendKeys(Keys.BACK_SPACE + string);
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearOrderPage.customerName.sendKeys(string);
    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearOrderPage.street.sendKeys(string);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearOrderPage.city.sendKeys(string);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearOrderPage.state.sendKeys(string);
    }

    @When("User enters {string}")
    public void user_enters(String string) {
        smartBearOrderPage.zip.sendKeys(string);
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        smartBearOrderPage.visa.click();
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearOrderPage.cardNr.sendKeys(string);
    }

    @When("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String arg0) {
        smartBearOrderPage.expireDate.sendKeys(arg0);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        BrowserUtils.sleep(3);
        smartBearOrderPage.process.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
//        Alert alert = Driver.getDriver().switchTo().alert();
//        alert.accept();
//        System.out.println("alert.getText() = " + alert.getText());
        smartBearOrderPage.allOrdersBtn.click();
        BrowserUtils.sleep(3);
        smartBearOrderPage.JohnWick.isDisplayed();



    }


}
