package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Dropdown_StepDef {

    DropdownsPage dropdownsPage = new DropdownsPage();


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {

//        Select select = new Select(dropdownsPage.monthDropdown);
//
//        List<WebElement> actualOptionsAsWebElement = select.getOptions();
//
//        List<String> actualOptionsAsString = new ArrayList<>();
//        for (WebElement each : actualOptionsAsWebElement) {
//            actualOptionsAsString.add(each.getText());
//        }
//This Utility method will return us List<String> of given dropdown WebElement
        List<String> actualOptionsAsString = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);
        //Asser will check the size of thew List first. If it is matching
        Assert.assertEquals(expectedMonth,actualOptionsAsString);
        System.out.println("actualOptionsAsString = " + actualOptionsAsString);


    }
}
