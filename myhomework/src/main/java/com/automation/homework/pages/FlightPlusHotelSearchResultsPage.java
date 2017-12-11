package com.automation.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightPlusHotelSearchResultsPage extends BasePage {

	public FlightPlusHotelSearchResultsPage(WebDriver pDriver) {
		super(pDriver);
		
	}	
		
	@FindBy(xpath="/html/body/div[4]/form/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/button")
	private WebElement fakeLinkOrigin;	
	
	@FindBy(xpath="/html/body/div[4]/form/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/button")
	private WebElement fakeLinkDestiny;
	
	@FindBy(xpath="/html/body/div[4]/form/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div[3]/button")
	private WebElement fakeLinkDates;
	
	@FindBy(xpath="/html/body/div[4]/form/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div[4]/span[2]")
	private WebElement roomsLabel;
	
	@FindBy(xpath="/html/body/div[4]/form/div[3]/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div[5]/span[2]/span")
	private WebElement travelersLabel;
	
	@FindBy(xpath="/html/body/div[4]/form/div[11]/div[2]/div[13]/section/div/div[3]/div/div[1]/div[2]/div/fieldset/ul/li[3]/button")
	private WebElement priceOrderLink;
	
	@FindBy(xpath="/html/body/div[4]/form/div[11]/div[2]/div[13]/section/div/div[16]/section/article[1]/div[2]/div/div[1]/div[2]/ul[1]/li[4]")
	private WebElement hotelName;
	
	
	public FlightPlusHotelDetailsPage ordenar(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(priceOrderLink));
		clickOnPriceOrderLink();
		int i=1;
		WebElement element=getDriver().findElement(By.xpath("/html/body/div[4]/form/div[11]/div[2]/div[13]/section/div/div[16]/section/article["+i+"]/div[2]/div/div[1]/div[2]/ul[1]/li[5]/strong/span[1]"));
		hotelName=getDriver().findElement(By.xpath("/html/body/div[4]/form/div[11]/div[2]/div[13]/section/div/div[16]/section/article["+i+"]/div[2]/div/div[1]/div[2]/ul[1]/li[4]"));
		if(element.getText().equals("3.5 out of 5.0")){			
			getWait().until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		else{
		i++;
		while(element!=null && i!=0){
			element=getDriver().findElement(By.xpath("/html/body/div[4]/form/div[11]/div[2]/div[13]/section/div/div[16]/section/article["+i+"]/div[2]/div/div[1]/div[2]/ul[1]/li[5]/strong/span[1]"));
			hotelName=getDriver().findElement(By.xpath("/html/body/div[4]/form/div[11]/div[2]/div[13]/section/div/div[16]/section/article["+i+"]/div[2]/div/div[1]/div[2]/ul[1]/li[4]"));
			if(element.getText().equals("3.5 out of 5.0")){
				getWait().until(ExpectedConditions.elementToBeClickable(element));
				element.click();	
			  i=0;
			}
			i++;
			
		}
		}
		}catch(TimeoutException e){
		return new FlightPlusHotelDetailsPage(getDriver());
		}catch(NoSuchElementException e){
		return new FlightPlusHotelDetailsPage(getDriver());	
		}
		return new FlightPlusHotelDetailsPage(getDriver());	
		
	}
	private void clickOnPriceOrderLink() {
		priceOrderLink.click();
	}
	public WebElement getFakeLinkOrigin() {
		return fakeLinkOrigin;
	}

	public void setFakeLinkOrigin(WebElement fakeLinkOrigin) {
		this.fakeLinkOrigin = fakeLinkOrigin;
	}

	public WebElement getFakeLinkDestiny() {
		return fakeLinkDestiny;
	}

	public void setFakeLinkDestiny(WebElement fakeLinkDestiny) {
		this.fakeLinkDestiny = fakeLinkDestiny;
	}

	public WebElement getFakeLinkDates() {
		return fakeLinkDates;
	}

	public void setFakeLinkDates(WebElement fakeLinkDates) {
		this.fakeLinkDates = fakeLinkDates;
	}

	public WebElement getRoomsLabel() {
		return roomsLabel;
	}

	public void setRoomsLabel(WebElement roomsLabel) {
		this.roomsLabel = roomsLabel;
	}

	public WebElement getTravelersLabel() {
		return travelersLabel;
	}

	public void setTravelersLabel(WebElement travelersLabel) {
		this.travelersLabel = travelersLabel;
	}

	public WebElement getPriceOrderLink() {
		return priceOrderLink;
	}

	public void setPriceOrderLink(WebElement priceOrderLink) {
		this.priceOrderLink = priceOrderLink;
	}
	
	public String getHotelName() {
		try{
		return hotelName.getText();
		}catch(NoSuchElementException e){
			return "Empty";
		}
	}
	public void setHotelName(WebElement hotelName) {
		this.hotelName = hotelName;
	}

	
	
	
	
	
	

}
