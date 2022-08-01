package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page {

    public Login2Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement logInButton;

    @FindBy(xpath = "//h1[text()='Quick Launchpad']")
    public WebElement quickLaunchpadPage;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboardPage;
}
