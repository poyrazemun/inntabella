package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEvent2Page {
    @FindBy(xpath = "//div[@tabindex='-1']//span[@id='ui-id-4']")
    public WebElement addEventPopUp;

    @FindBy(xpath = "//span[@class='color empty-color']")
    public WebElement colorMark;

    @FindBy(xpath = "//input[@data-name='field__all-day']")
    public WebElement allDayCheckbox;

    @FindBy(xpath = "//*[@data-name=\"recurrence-repeat\"]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "//*[@class=\"recurrence-repeats__select\"] ")
    public WebElement recurrenceRepeats;

    @FindBy(xpath = "(//input[@type='radio']) [3] ")
    public WebElement controlSectionNever;

    @FindBy(xpath = "(//input[@type='radio']) [4] ")
    public WebElement controlSectionAfter;

    @FindBy(xpath = "(//input[@type='radio']) [5] ")
    public WebElement controlSectionBy;
}
