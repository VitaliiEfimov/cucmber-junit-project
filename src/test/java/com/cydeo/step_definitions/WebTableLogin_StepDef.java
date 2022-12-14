package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDef {

    /*
    TC #: Login scenario
    1- Open a chrome browser 2- Go to:
    https://web-table-2.cydeo.com/login
    3- Enter  username:  Test
    4- Enter password: Tester
    5- Verify URL:
    Expected: URL should end with “orders”
     */

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableLoginPage"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.inputUsername.sendKeys(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.inputPassword.sendKeys(password);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_order() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }




    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
//        webTableLoginPage.inputUsername.sendKeys((credentials.get("username");
//        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginBtn.click();
        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));
    }

    @When("user enters username {string}, password {string} clicks to login button")
    public void userEntersUsernamePasswordClicksToLoginButton(String username, String password) {
//        webTableLoginPage.inputUsername.sendKeys(username);
//        webTableLoginPage.inputPassword.sendKeys(password);
//        webTableLoginPage.loginBtn.click();

        webTableLoginPage.login(username, password);

    }
}
