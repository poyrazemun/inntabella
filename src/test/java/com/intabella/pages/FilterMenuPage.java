package com.intabella.pages;

import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import org.openqa.selenium.By;
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

	@FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable'][.='Sedan']")
	public WebElement sedan;

	public WebElement filterName(String name) {
		return Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + name + "')]/../input"));
	}

	public WebElement filterNames(String name) {
		return Driver.getDriver().findElement(By.xpath("//input[@value='" + name + "']"));
	}


	public boolean isClickable(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean hasCompactOrSedan(List<WebElement> elements) {
		List<String> elementsText = BrowserUtils.getElementsText(elements);
		for (String each : elementsText) {
			if(each.equals("Compact")||each.equals("Sedan")){
				return false;
			}
		}
		return true;
	}






}
