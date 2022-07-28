package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FilterMenuPage {

	@FindBy(xpath = "//i[@class='fa-filter hide-text']")
	public WebElement filtersButton;

	@FindBy(className = "add-filter-button")
	public WebElement manageFiltersButton;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement filterInputBox;

	@FindBy(xpath = "//a[@title='Reset']/i")
	public WebElement resetButton;

	@FindBys({@FindBy(name = "multiselect_0")})
	public List<WebElement> filterNames;

	@FindBys({@FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")})
	public List<WebElement> filteredMenusLocations;

	public boolean isClickable(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}



}
