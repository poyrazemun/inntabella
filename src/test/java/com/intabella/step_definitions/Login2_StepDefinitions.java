package com.intabella.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2_StepDefinitions {

    @When("driver enters username {string} and password {string}")
    public void driver_enters_username_and_password(String string, String string2) {
    }
    @When("driver clicks login button")
    public void driver_clicks_login_button() {
    }
    @Then("driver should land on the {string} page")
    public void driver_should_land_on_the_page(String string) {
    }

    @When("Sales Manager enters username {string} and password {string}")
    public void sales_manager_enters_username_and_password(String string, String string2) {
    }
    @When("Sales Manager clicks login button")
    public void sales_manager_clicks_login_button() {
    }
    @Then("Sales Manager should land on the {string} page")
    public void sales_manager_should_land_on_the_page(String string) {
    }

    @When("Store Manager enters username {string} and password {string}")
    public void store_manager_enters_username_and_password(String string, String string2) {
    }
    @When("Store Manager clicks login button")
    public void store_manager_clicks_login_button() {
    }
    @Then("Store Manager should land on the {string} page")
    public void store_manager_should_land_on_the_page(String string) {
    }


}
