package com.intabella.step_definitions;

import com.google.common.collect.Comparators;
import com.google.common.collect.Ordering;
import com.intabella.pages.VehiclePage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class VehicleTableArrangements_StepDefinitions {

    VehiclePage vehiclePage = new VehiclePage();
    List<String> modelYears;

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

    @When("user clicks {string} under the View Per Page dropdown menu")
    public void userClicksUnderTheViewPerPageDropdownMenu(String arg0) {
        for (int i = 0; i < vehiclePage.viewPerPageNumbers.size(); i++) {
            if (arg0.equals(vehiclePage.viewPerPageNumbers.get(i).getText())) {
                vehiclePage.viewPerPageNumbers.get(i).click();
            }
        }
    }

    @Then("user should see {int} vehicle information")
    public void userShouldSeeVehicleInformation(int arg0) {
        Assert.assertEquals(arg0, vehiclePage.vehicleInformationCount.size());
    }

    @When("user clicks on the column name")
    public void user_clicks_on_the_column_name() {
        BrowserUtils.sleep(5);
        vehiclePage.modelYearColumn.click();
        BrowserUtils.sleep(5);
    }

    @Then("user sorts a column in ascending order")
    public void user_sorts_a_column_in_ascending_order() {
        modelYears = new ArrayList<>();
        for (int i = 0; i < vehiclePage.modelYears.size(); i++) {
            modelYears.add(vehiclePage.modelYears.get(i).getText());
        }

        Assert.assertTrue(Ordering.natural().isOrdered(modelYears));


    }

    @Then("user sorts a column in descending order")
    public void user_sorts_a_column_in_descending_order() {

        modelYears = new ArrayList<>();
        for (int i = 0; i < vehiclePage.modelYears.size(); i++) {
            modelYears.add(vehiclePage.modelYears.get(i).getText());
        }
        Assert.assertTrue(Ordering.natural().reverse().isOrdered(modelYears));
    }

    @Then("user clicks on the reset button")
    public void user_clicks_on_the_reset_button() {
        BrowserUtils.waitForClickablility(vehiclePage.resetButton,7);
        vehiclePage.resetButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user removes all sortings and filter")
    public void user_removes_all_sortings_and_filter() {
        modelYears = new ArrayList<>();
        for (int i = 0; i < vehiclePage.modelYears.size(); i++) {
            modelYears.add(vehiclePage.modelYears.get(i).getText());
        }

        Assert.assertFalse(Ordering.natural().isOrdered(modelYears));


    }

}
