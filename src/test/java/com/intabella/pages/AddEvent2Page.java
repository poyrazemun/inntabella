package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEvent2Page {
    @FindBy(xpath = "//div[@tabindex='-1']//span[@id='ui-id-4']")
    public WebElement addEventPopUp;

    @FindBy(xpath = "//span[@class='color empty-color']")
    public WebElement colorMark;


}
