package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EtsyTitleVerificationHomePage {
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on home page")
    public void user_is_on_https_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("User sees title is as expected. Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_sees_title_is_as_expected_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {
        String expectedEtsyHomePageTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualEtsyHomePageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("EtsyHomePageTitle", expectedEtsyHomePageTitle, actualEtsyHomePageTitle);
    }
}
