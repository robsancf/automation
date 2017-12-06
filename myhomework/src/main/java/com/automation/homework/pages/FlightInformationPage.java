package com.automation.homework.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightInformationPage extends BasePage {

	public FlightInformationPage(WebDriver pDriver) {
		super(pDriver);
		
	}
	
	@FindBy(xpath="/html/body/main/section[2]/div/div[2]/div/div[1]/span[3]")
	private WebElement tripTotalPrice;
	
	@FindBy(xpath="/html/body/main/section[2]/div/div[2]/div/div[2]")
	private WebElement priceGuarantee;	
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[1]/div/div/div[1]/h3")
	private WebElement departureDate;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[1]/div/div/div[1]/ol/li[1]/span[2]")
	private WebElement departureFromPlace;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[2]/div/div/div[1]/ol/li[2]/span[2]")
	private WebElement departureToPlace;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[1]/div/div/div[3]/div[1]/span")
	private WebElement departureStartHour;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[1]/div/div/div[3]/div[3]/span")
	private WebElement departureArrivingHour;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[1]/div/div/div[3]/div[4]/span[1]")
	private WebElement departureDurationTrip;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[2]/div/div/div[1]/h3")
	private WebElement returnDate;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[2]/div/div/div[1]/ol/li[1]/span[2]")
	private WebElement returnFromPlace;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[2]/div/div/div[1]/ol/li[2]/span[2]")
	private WebElement returnToPlace;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[2]/div/div/div[3]/div[1]/span")
	private WebElement returnStartHour;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[2]/div/div/div[3]/div[3]/span")
	private WebElement returnArrivingHour;
	
	@FindBy(xpath="/html/body/main/section[1]/div/div[2]/div/div/div[3]/div[4]/span[1]")
	private WebElement returnDurationTrip;
	
	@FindBy(xpath="//*[@id='bookButton']")
	private WebElement bookingButton;

	
	public WebElement getBookingButton() {
		return bookingButton;
	}


	public void setBookingButton(WebElement bookingButton) {
		this.bookingButton = bookingButton;
	}


	public WebElement getTripTotalPrice() {
		return tripTotalPrice;
	}
	
	
	public void setTripTotalPrice(WebElement tripTotalPrice) {
		this.tripTotalPrice = tripTotalPrice;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(WebElement departureDate) {
		this.departureDate = departureDate;
	}

	public WebElement getDepartureFromPlace() {
		return departureFromPlace;
	}

	public void setDepartureFromPlace(WebElement departureFromPlace) {
		this.departureFromPlace = departureFromPlace;
	}

	public WebElement getDepartureToPlace() {
		return departureToPlace;
	}

	public void setDepartureToPlace(WebElement departureToPlace) {
		this.departureToPlace = departureToPlace;
	}

	public WebElement getDepartureStartHour() {
		return departureStartHour;
	}

	public void setDepartureStartHour(WebElement departureStartHour) {
		this.departureStartHour = departureStartHour;
	}

	public WebElement getDepartureArrivingHour() {
		return departureArrivingHour;
	}

	public void setDepartureArrivingHour(WebElement departureArrivingHour) {
		this.departureArrivingHour = departureArrivingHour;
	}

	public WebElement getDepartureDurationTrip() {
		return departureDurationTrip;
	}

	public void setDepartureDurationTrip(WebElement departureDurationTrip) {
		this.departureDurationTrip = departureDurationTrip;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(WebElement returnDate) {
		this.returnDate = returnDate;
	}

	public WebElement getReturnFromPlace() {
		return returnFromPlace;
	}

	public void setReturnFromPlace(WebElement returnFromPlace) {
		this.returnFromPlace = returnFromPlace;
	}

	public WebElement getReturnToPlace() {
		return returnToPlace;
	}

	public void setReturnToPlace(WebElement returnToPlace) {
		this.returnToPlace = returnToPlace;
	}

	public WebElement getReturnStartHour() {
		return returnStartHour;
	}

	public void setReturnStartHour(WebElement returnStartHour) {
		this.returnStartHour = returnStartHour;
	}

	public WebElement getReturnArrivingHour() {
		return returnArrivingHour;
	}

	public void setReturnArrivingHour(WebElement returnArrivingHour) {
		this.returnArrivingHour = returnArrivingHour;
	}

	public WebElement getReturnDurationTrip() {
		return returnDurationTrip;
	}

	public void setReturnDurationTrip(WebElement returnDurationTrip) {
		this.returnDurationTrip = returnDurationTrip;
	}

	public WebElement getPriceGuarantee() {
		return priceGuarantee;
	}

	public void setPriceGuarantee(WebElement priceGuarantee) {
		this.priceGuarantee = priceGuarantee;
	}
	
	public FlightBookingDetailsPage open(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(bookingButton));
		clickOnBookingButton();
		return new FlightBookingDetailsPage(getDriver());
		}catch(TimeoutException e){
			
			return new FlightBookingDetailsPage(getDriver());
		}
		
	}

	private void clickOnBookingButton() {
		bookingButton.click();
		
	}

	
	
	
	

}
