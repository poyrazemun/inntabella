package com.intabella.step_definitions;

import com.intabella.pages.AddEvent2Page;
import com.intabella.pages.DashboardPage;
import com.intabella.pages.GeneralInfoPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddEvent2_StepDefinitions {
    Actions action = new Actions(Driver.getDriver());
    DashboardPage dashboardPage = new DashboardPage();
    GeneralInfoPage generalInfoPage = new GeneralInfoPage();
    AddEvent2Page addEvent2Page= new AddEvent2Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebElement chassisNumber;
    WebElement addEvent;





    @When("clicks on add event button")
    public void clicks_on_add_event_button() {
        generalInfoPage.waitUntilLoaderScreenDisappear();
        generalInfoPage.addEvent.click();

    }

    @And("{string} page pops up")
    public void pagePopsUp(String addEvent) {
        Assert.assertTrue(addEvent2Page.addEventPopUp.isDisplayed());

    }

    @Then("user clicks one {string}")
    public void user_clicks_one(String string) {
        addEvent2Page.colorMark.click();
        Assert.assertTrue(addEvent2Page.colorMark.isSelected());

    }

    //------------------
    @Then("user click {string} checkbox")
    public void user_click_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user clicks {string} checkbox")
    public void user_clicks_checkbox(String string) {



    }
    @Then("user can choose {string} #Daily, Weekly, Monthly, Yearly")
    public void user_can_choose_daily_weekly_monthly_yearly(String string) {
        Select occurrence = new Select(addEvent2Page.recurrenceRepeats);

        List<WebElement> op = occurrence.getOptions();
        int size = op.size();
        for (int i = 0; i < size; i++) {
            String options = op.get(i).getText();
            System.out.println(options);


        }

    }
