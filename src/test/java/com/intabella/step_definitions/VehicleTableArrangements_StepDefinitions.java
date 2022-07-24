package com.intabella.step_definitions;

import com.intabella.pages.VehiclePage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehicleTableArrangements_StepDefinitions {

    VehiclePage vehiclePage = new VehiclePage();

    @Then("user sees the value of View Per Page as {string}")
    public void userSeesTheValueOfViewPerPageAs(String arg0) {
        BrowserUtils.waitForVisibility(vehiclePage.viewPerPageDropDown, 2);
        Assert.assertEquals(arg0, vehiclePage.viewPerPageDropDown.getText());
    }

    @When("user clicks the View Per Page dropdown menu")
    public void user_clicks_the_view_per_page_dropdown_menu() {
        BrowserUtils.waitForClickablility(vehiclePage.viewPerPageDropDown, 5);
        vehiclePage.viewPerPageDropDown.click();

    }

    @Then("user should see {string},{string},{string} and {string}")
    public void userShouldSeeAnd(String arg0, String arg1, String arg2, String arg3) {

        List<String> expectedResults = (Arrays.asList(arg0, arg1, arg2, arg3));
        List<String> actualResults = new ArrayList<>();

        for (int i = 0; i < vehiclePage.viewPerPageNumbers.size(); i++) {
            actualResults.add(vehiclePage.viewPerPageNumbers.get(i).getText());
        }

        Assert.assertEquals(expectedResults, actualResults);
    }

    @Then("user should see {double} and {int}")
    public void user_should_see_and(Double double1, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks {int} under the View Per Page dropdown menu")
    public void user_clicks_under_the_view_per_page_dropdown_menu(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should see {int} vehicle information\\/rows")
    public void user_should_see_vehicle_information_rows(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("user sorts a column in descending order")
    public void user_sorts_a_column_in_descending_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user clicks on the column name")
    public void user_clicks_on_the_column_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user sorts a column in ascending order")
    public void user_sorts_a_column_in_ascending_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on the reset button")
    public void user_clicks_on_the_reset_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user removes all sortings and filter")
    public void user_removes_all_sortings_and_filter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("user should see {int} vehicle information")
    public void userShouldSeeVehicleInformation(int arg0) {
    }
}
