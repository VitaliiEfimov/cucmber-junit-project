package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyTitleVerificationAfterSearch {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("{string}")
    public void string(String string) {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.etsySearchBox.sendKeys("Wooden Spoon");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.etsySearchBtn.click();
    }

    @Then("User sees Wooden spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedEtsyAfterSearchTitle = "Wooden spoon";
        String actualEtsyAfterSearchTitle = Driver.getDriver().getTitle();
        System.out.println("actualEtsyAfterSearchTitle = " + actualEtsyAfterSearchTitle);
        Assert.assertTrue("EtsyAfterSearchTitle", actualEtsyAfterSearchTitle.contains("Wooden spoon"));

    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String arg0) {

        String actualEtsyAfterSearchTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("EtsyAfterSearchTitle", actualEtsyAfterSearchTitle.contains(arg0));
    }
}
