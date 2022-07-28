package com.intabella.step_definitions;

import com.intabella.pages.FilterMenuPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class FilterMenu_StepDefinitions {


	FilterMenuPage filterMenuPage = new FilterMenuPage();

	@Then("filter button is hidden")
	public void filter_button_is_hidden() {

		Assert.assertFalse(filterMenuPage.manageFiltersButton.isDisplayed());
	}

	@When("the user clicks on filter button")
	public void the_user_clicks_on_filter_button() {



	}

	@Then("manage filter button is visible")
	public void manage_filter_button_is_visible() {



	}



	@When("the user clicks on manage filter button")
	public void the_user_clicks_on_manage_filter_button() {



	}

	@Then("all names under manage filters menu are clickable")
	public void all_names_under_manage_filters_menu_are_clickable() {



	}

	@Then("user enters filter name on the filter input box and corresponding name is displayed")
	public void user_enters_filter_name_on_the_filter_input_box_and_corresponding_name_is_displayed() {

	}

	@When("the user clicks {int} filters")
	public void the_user_clicks_filters(Integer int1) {

	}

	@Then("filtered names are displayed on the filter menu place")
	public void filtered_names_are_displayed_on_the_filter_menu_place() {

	}

	@When("the user clicks reset button")
	public void the_user_clicks_reset_button() {

	}

	@Then("all filters are gone")
	public void all_filters_are_gone() {

	}

}
