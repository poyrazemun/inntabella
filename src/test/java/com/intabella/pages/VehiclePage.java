package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclePage extends BasePage {

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> allCars;

    @FindBy(xpath = "//tbody/tr[1]/td[21]")
    public WebElement threeDots;

    @FindBy(xpath = "//div[@class='dropdown']")
    public List<WebElement> dropdown;

    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'][1]/li/ul/li/a[@title='Delete'])[1]")
    public WebElement deleteIcon;

    @FindBy(xpath = "//*[.='Are you sure you want to delete this item?']")
    public WebElement confirmationPopUp;

    @FindBy(xpath = "//*[.='Yes, Delete']")
    public WebElement deleteConfirmationButton;

    @FindBy(xpath = "//*[.='Item deleted']")
    public WebElement itemDeletedMessage;

    @FindBy(xpath = "//button[@data-toggle='dropdown']")
    public WebElement viewPerPageDropDown;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]/following-sibling::ul/li")
    public List<WebElement> viewPerPage;

    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalNumberOfRecords;


    @FindBy(xpath = "//a[@class='dropdown-item']")
    public List<WebElement> viewPerPageNumbers;

}
