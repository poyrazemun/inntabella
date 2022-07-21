package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Character.isDigit;

public class VehiclesPage {

   public VehiclesPage(){
      PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy (xpath = "//tbody/tr")
   public List<WebElement> allCars;


   @FindBy (xpath = "//tbody/tr[1]/td[21]")
   public WebElement threeDots;

   @FindBy (xpath = "//div[@class='dropdown']")
   public List<WebElement> dropdown;

   @FindBy (xpath = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'][1]/li/ul/li/a[@title='Delete'])[1]") //  (//a[@title='Delete'])[1]
   public WebElement deleteIcon;

   @FindBy (xpath = "//*[.='Are you sure you want to delete this item?']")
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

   String totalRecords = totalNumberOfRecords.getText();

   public int totalNumberOfCars = getTotalNumber(totalRecords);

   public static int getTotalNumber(String str){
      String result = "";
      for (int i = 0; i < str.length(); i++) {
         if(isDigit(str.charAt(i))){
            result+=str;
         }
      }
      return Integer.parseInt(str);
   }

}

