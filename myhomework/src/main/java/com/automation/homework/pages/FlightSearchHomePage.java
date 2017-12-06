package com.automation.homework.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightSearchHomePage extends BasePage {
	
	public FlightSearchHomePage(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://www.travelocity.com/");
	}
	
	@FindBy(id="tab-flight-tab-hp")
	private WebElement tabFlightButton;
	
	@FindBy(id="flight-origin-hp-flight")
	private WebElement flyingFromInput;
	
	@FindBy(id="flight-destination-hp-flight")
	private WebElement flyingToInput;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[1]/form/fieldset[2]/div[1]/div[2]/div/label/span[2]")
	private WebElement flyingDepartureCalendar;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[1]/form/fieldset[2]/div[1]/div[2]/div/div/div/button[2]")
	private WebElement flyingDepartureCalendarArrow;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[1]/form/fieldset[2]/div[1]/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/button")
	private WebElement flyingDepartureDate;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[1]/form/fieldset[2]/div[1]/div[3]/div/label/span[2]")
	private WebElement flyingReturningCalendar;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[1]/form/fieldset[2]/div[1]/div[3]/div/div/div/button[2]")
	private WebElement flyingReturningCalendarArrow;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[1]/form/fieldset[2]/div[1]/div[3]/div/div/div/div[3]/table/tbody/tr[2]/td[4]/button")
	private WebElement flyingReturningCalendarDate;
	
	@FindBy(id="package-destination-hp-package")
	private WebElement flyingDestinationDate;
	
	@FindBy(id="gcw-packages-form-hp-package")
	private WebElement panelForm;
	
	@FindBy(id="package-rooms-hp-package")
	private WebElement packRoomsSelect;
	
	@FindBy(id="package-1-adults-hp-package")
	private WebElement adultsNumberSelect;
	
	@FindBy(id="package-1-children-hp-package")
	private WebElement childrenNumberSelect;
	
    @FindBy(id="partialHotelBooking-hp-package")
    private WebElement checkBoxBookingHotel;
    
    @FindBy(id="package-advanced-options-hp-package")
    private WebElement advancedOptionsLink;
    
    @FindBy(id="package-advanced-preferred-class-hp-package")
    private WebElement preferredClassCombo; 	
	
	@FindBy(id="tab-flight-tab-hp")
	private WebElement flightButton;
	
	@FindBy(xpath="/html/body/section/div/div/div/div[3]/div/div[1]/div/section[1]/form/div[8]/label/button")
	private WebElement searchButton;
	
    private void clickOnFlightTabButton() {
		tabFlightButton.click();
		
	}
	
	public void clickOnDepartureCalendar(){
		
		flyingDepartureCalendar.click();		
		
	}
	
	private void clickOnDepartureCalendarArrow() {		
		flyingDepartureCalendarArrow.click();
	}
	
    private void clickOnDepartureCalendarDate() {
		
    	flyingDepartureDate.click();
	}
    
    private void clickOnReturningCalendarDate() {
    	flyingReturningCalendarDate.click();
		
	}

	private void clickOnReturningCalendarArrow() {
		flyingReturningCalendarArrow.click();
		
	}

	private void clickOnReturningCalendar() {
		flyingReturningCalendar.click();
		
	}

	
	public void clickOnPanelForm(){
		
		panelForm.click();
	}
	
	public void clickOnFlightButton(){
		flightButton.click();
	}
	
	public void clickOnSearchButton(){
		searchButton.click();
	}
	
    public FlightSearchResultsPage buscar(){
    	try{
    	getWait().until(ExpectedConditions.elementToBeClickable(tabFlightButton));
    	clickOnFlightTabButton();
		flyingFromInput.sendKeys("Las Vegas, NV (LAS-McCarran Intl.)");
		flyingToInput.sendKeys("Los Angeles, CA (LAX-Los Angeles Intl.)");
		getWait().until(ExpectedConditions.elementToBeClickable(flyingDepartureCalendar));
		clickOnDepartureCalendar();
		getWait().until(ExpectedConditions.elementToBeClickable(flyingDepartureCalendarArrow));
		clickOnDepartureCalendarArrow();
		getWait().until(ExpectedConditions.elementToBeClickable(flyingDepartureCalendarArrow));
		clickOnDepartureCalendarArrow();
		getWait().until(ExpectedConditions.elementToBeClickable(flyingDepartureDate));
		clickOnDepartureCalendarDate();
		getWait().until(ExpectedConditions.elementToBeClickable(flyingReturningCalendar));
		clickOnReturningCalendar();
		getWait().until(ExpectedConditions.elementToBeClickable(flyingReturningCalendarArrow));
		clickOnReturningCalendarArrow();
		getWait().until(ExpectedConditions.elementToBeClickable(flyingReturningCalendarDate));
		clickOnReturningCalendarDate();
		getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
		clickOnSearchButton();
		return new FlightSearchResultsPage(getDriver());
    	}catch(TimeoutException e){
    	return new FlightSearchResultsPage(getDriver());	
    		
    	}catch(NoSuchElementException e){
   		return new FlightSearchResultsPage(getDriver());	
    		
    	}
	}

	
	
	

	

}
