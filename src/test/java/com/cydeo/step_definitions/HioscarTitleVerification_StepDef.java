package com.cydeo.step_definitions;

import com.cydeo.pages.HioscarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HioscarTitleVerification_StepDef {
    HioscarPage hioscarPage = new HioscarPage();

    @Given("user is on hioscar page")
    public void user_is_on_hioscar_page() {
        Driver.getDriver().get("https://www.hioscar.com/care-options");
    }

    @When("user click Search network")
    public void user_click_search_network() {
        hioscarPage.SearchNetworkBtn.click();
    }

    @When("user from Coverage year dropdown Select {string} option")
    public void user_from_coverage_year_dropdown_select_option(String string) {
        hioscarPage.coverageYearSelectOpt.click();
        hioscarPage.option2023.click();
    }

    @When("user from Coverage access dropdown Select {string} option")
    public void user_from_coverage_access_dropdown_select_option(String string) {
        hioscarPage.coverageAccessSelectOpt.click();
        hioscarPage.optionEmployerProvider.click();
    }

    @When("user from Network partner dropdown Select {string} option")
    public void user_from_network_partner_dropdown_select_option(String string) {
        hioscarPage.networkPartnerSelectOpt.click();
        hioscarPage.optionOscar.click();

    }

    @When("user from Coverage area dropdown Select {string}")
    public void user_from_coverage_area_dropdown_select(String string) {
        hioscarPage.coverageAriaSelectOpt.click();
        hioscarPage.newJerseySelectOpt.click();
    }

    @When("user click Continue button")
    public void user_click_continue_button() {
        hioscarPage.continueBtn.click();
    }

    @Then("user should see title name of the page: {string}")
    public void user_should_see_title_name_of_the_page(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }
}
