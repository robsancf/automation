package com.automation.homework.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightPlusHotelSearchHomePage extends BasePage {

	public FlightPlusHotelSearchHomePage(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://www.travelocity.com/");
	}
	
	@FindBy(id="tab-package-tab-hp")
	private WebElement tabFlightPlusHotelButton;
	
	@FindBy(id="package-origin-hp-package")
	private WebElement flyingFromInput;
	
	@FindBy(id="package-destination-hp-package")
	private WebElement flyingToInput;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[3]/form/div[6]/div[1]/div/label/span[2]")
	private WebElement departingDateCalendar;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[3]/form/div[6]/div[1]/div/div/div/button[2]")
	private WebElement departingDateCalendarArrow;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[3]/form/div[6]/div[1]/div/div/div/div[3]/table/tbody/tr[1]/td[6]/button")
	private WebElement departingDateCalendarDate;
		
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[3]/form/div[6]/div[2]/div/label/span[2]")
	private WebElement returningDateCalendar;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[3]/form/div[6]/div[2]/div/div/div/button[2]")
	private WebElement returningDateCalendarArrow;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[3]/form/div[6]/div[2]/div/div/div/div[2]/table/tbody/tr[2]/td[5]/button")
	private WebElement returningDateCalendarDate;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[3]/form/div[6]")
	private WebElement layoutToClick;
	
	@FindBy(id="package-rooms-hp-package")
	private WebElement packageRoomsCombo;
	
	@FindBy(id="search-button-hp-package")
	private WebElement searchButton;
	
	public FlightPlusHotelSearchResultsPage buscar(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(tabFlightPlusHotelButton));
    	clickOnFlightPlusHotelTabButton();
		flyingFromInput.sendKeys("Las Vegas, NV (LAS-McCarran Intl.)");
		flyingToInput.sendKeys("Los Angeles, CA (LAX-Los Angeles Intl.)");
		getWait().until(ExpectedConditions.elementToBeClickable(departingDateCalendar));
		clickOnDepartingDateCalendar();
		getWait().until(ExpectedConditions.elementToBeClickable(departingDateCalendarArrow));
		clickOnDepartingDateCalendarArrow();
		getWait().until(ExpectedConditions.elementToBeClickable(departingDateCalendarDate));
		clickOnDepartingDateCalendarDate();		
		getWait().until(ExpectedConditions.elementToBeClickable(returningDateCalendar));
		clickOnReturningDateCalendar();
		getWait().until(ExpectedConditions.elementToBeClickable(returningDateCalendarArrow));
		clickOnReturningDateCalendarArrow();
		getWait().until(ExpectedConditions.elementToBeClickable(returningDateCalendarDate));
		clickOnReturningDateCalendarDate();		
//		getWait().until(ExpectedConditions.elementToBeClickable(layoutToClick));
//		clickOnLayoutToClick();
		getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
		clickOnSearchButton();
		return new FlightPlusHotelSearchResultsPage(getDriver()) ;
		}catch(TimeoutException e){
		return new FlightPlusHotelSearchResultsPage(getDriver()) ;
		}catch(NoSuchElementException e){
		return new FlightPlusHotelSearchResultsPage(getDriver()) ;	
		}catch(NullPointerException e){
		return new FlightPlusHotelSearchResultsPage(getDriver()) ;	
		}
		
		
	}

	private void clickOnSearchButton() {
		// TODO Auto-generated method stub
		searchButton.click();
	}

	private void clickOnReturningDateCalendarDate() {
		// TODO Auto-generated method stub
		returningDateCalendarDate.click();
	}

	private void clickOnReturningDateCalendarArrow() {
		// TODO Auto-generated method stub
		returningDateCalendarArrow.click();
	}

	private void clickOnReturningDateCalendar() {
		// TODO Auto-generated method stub
		returningDateCalendar.click();
	}

	private void clickOnDepartingDateCalendarDate() {
		// TODO Auto-generated method stub
		departingDateCalendarDate.click();
	}

	private void clickOnDepartingDateCalendarArrow() {
		// TODO Auto-generated method stub
		departingDateCalendarArrow.click();
	}

	private void clickOnDepartingDateCalendar() {
		// TODO Auto-generated method stub
		departingDateCalendar.click();
	}

	private void clickOnFlightPlusHotelTabButton() {
		tabFlightPlusHotelButton.click();
		
	}
	
	
	

}
