package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.VehiclesPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteCarStepDefinitions {

    Actions action = new Actions(Driver.getDriver());
    DashboardPage dashboardPage = new DashboardPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    //Test1
    @When("the user hovers the mouse over the three dots")
    public void the_user_hovers_the_mouse_over_the_three_dots() {
        action.moveToElement(vehiclesPage.threeDots).build().perform();
        BrowserUtils.sleep(5);
    }

    @Then("the user should see the {string} option")
    public void the_user_should_see_the_option(String string) {

        assertTrue(vehiclesPage.deleteIcon.isDisplayed());

    }



    //Test2 and First two steps of Test3
    @When("the user clicks on delete icon")
    public void the_user_clicks_on_delete_icon() {

    }
    @Then("delete confirmation window pups up")
    public void delete_confirmation_window_pups_up() {

    }


    //Test3
    @When("the user confirms the delete")
    public void the_user_confirms_the_delete() {

    }
    @Then("{string} message is displayed")
    public void message_is_displayed(String string) {

    }


    //Test4
    @When("the user clicks on any car on the table")
    public void the_user_clicks_on_any_car_on_the_table() {

    }
    @When("the user lands on General Information page")
    public void the_user_lands_on_general_information_page() {

    }
    @When("clicks on delete button")
    public void clicks_on_delete_button() {

    }
    @Then("the {string} message should be displayed")
    public void the_message_should_be_displayed(String string) {

    }


    //Test5
    @Then("the deleted car is removed from the table")
    public void the_deleted_car_is_removed_from_the_table() {

    }

    @And("the user navigates to vehicles module under the fleet tab")
    public void theUserNavigatesToVehiclesModuleUnderTheFleetTab() {

        Driver.getDriver().get("https://qa.intabella.com/entity/Extend_Entity_Carreservation");

//        wait.until(ExpectedConditions.visibilityOf(dashboardPage.topBarMenu.get(1)));
//        action.moveToElement(dashboardPage.topBarMenu.get(1)).build().perform();
//        BrowserUtils.sleep(3);
//        dashboardPage.cars.click();
//        BrowserUtils.sleep(3);
//        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());


    }
}