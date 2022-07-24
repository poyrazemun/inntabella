package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.GeneralInfoPage;
import com.intabella.pages.VehiclesPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.lang.Character.isDigit;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DeleteCarStepDefinitions {

    Actions action = new Actions(Driver.getDriver());
    DashboardPage dashboardPage = new DashboardPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    GeneralInfoPage generalInfoPage = new GeneralInfoPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();



    //Test1
    @When("the user hovers the mouse over the three dots")
    public void the_user_hovers_the_mouse_over_the_three_dots() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        action.moveToElement(vehiclesPage.threeDots).build().perform();
    }

    @Then("the user should see the delete option")
    public void the_user_should_see_the_delete_option() {
        assertTrue(vehiclesPage.deleteButton.isDisplayed());

    }


    //Test2 and First two steps of Test3
    @When("the user clicks on delete icon")
    public void the_user_clicks_on_delete_icon() {
        vehiclesPage.deleteButton.click();
    }

    @Then("delete confirmation window pops up")
    public void delete_confirmation_window_pops_up() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        assertTrue(vehiclesPage.confirmationPopUp.isDisplayed());
    }


    //Test3
    @When("the user confirms the delete")
    public void the_user_confirms_the_delete() {

        vehiclesPage.deleteConfirmationButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("{string} message is displayed")
    public void message_is_displayed(String string) {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        assertEquals(string, vehiclesPage.itemDeletedMessage.getText());
    }


    //Test4
    @When("the user clicks on any car on the table")
    public void the_user_clicks_on_any_car_on_the_table() {
        int totalNumberOfCars = VehiclesPage.getTotalNumber(vehiclesPage.getTotalRecords());
        System.out.println("totalNumberOfCars = " + totalNumberOfCars);
        int randomInt = (int) (Math.random() * /*totalNumberOfCars*/25 + 1);
        System.out.println("randomInt = " + randomInt);
        vehiclesPage.waitUntilLoaderScreenDisappear();
        vehiclesPage.getXthRowOfCarsTable(randomInt).click();
    }

    @When("the user lands on General Information page")
    public void the_user_lands_on_general_information_page() {
        assertTrue(generalInfoPage.deleteButton.isDisplayed());
    }

    @When("clicks on delete button")
    public void clicks_on_delete_button() {
        generalInfoPage.waitUntilLoaderScreenDisappear();
        generalInfoPage.deleteButton.click();
    }

    @Then("the {string} message should be displayed")
    public void the_message_should_be_displayed(String string) {
        assertEquals(string, vehiclesPage.carDeletedMessage.getText());
    }


    //Test5
    @Then("the deleted car is removed from the table")
    public void the_deleted_car_is_removed_from_the_table() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        boolean isRemoved = true;
        for (int i = 0; i < vehiclesPage.allChassisNumbers.size(); i++) {
            if(generalInfoPage.chassisNumber.getText().equals(vehiclesPage.allChassisNumbers.get(i).getText()))
                isRemoved = false;
        }

        assertTrue(isRemoved);
    }







}