package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralInfoPage extends BasePage{

    @FindBy (xpath = "//a[@data-success-message='Car deleted']")
    public WebElement deleteButton;

    @FindBy (xpath = "(//div[@class='control-label'])[5]")
    public WebElement chassisNumber;


    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/a")
    public WebElement addEvent;

    @FindBy (xpath = "//div[@class='details']")
    public WebElement calendarEvent;

}
