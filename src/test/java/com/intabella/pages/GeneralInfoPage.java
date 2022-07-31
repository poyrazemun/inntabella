package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralInfoPage extends BasePage{

    @FindBy (xpath = "//a[@data-success-message='Car deleted']")
    public WebElement deleteButton;

    @FindBy (xpath = "(//div[@class='control-label'])[5]")
    public WebElement chassisNumber;
}
