package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage {

   public VehiclesPage(){
      PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy (xpath = "//tbody/tr")
   public List<WebElement> allCars;


   @FindBy (xpath = "//tbody/tr[1]/td[21]")
   public WebElement threeDots;

   @FindBy (xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'][1]/li/ul/li/a[@title='Delete'][1]")
   public WebElement deleteIcon;

   

}
