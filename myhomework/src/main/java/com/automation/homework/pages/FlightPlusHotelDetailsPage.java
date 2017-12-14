package com.automation.homework.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightPlusHotelDetailsPage extends BasePage {

	public FlightPlusHotelDetailsPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html/body/div[4]/div[6]/header/div[3]/div[1]/strong/span[2]")
	private WebElement stars;
	
	@FindBy(xpath="//*[@id='hotel-name']")
	private WebElement hotelName;
	
	@FindBy(xpath="/html/body/div[4]/div[6]/section/div[3]/div/div/section/nav/ul/li[2]/a/span")
	private WebElement hotelRooms;

	private String hotlName;
	
	public WebElement getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(WebElement hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

	public WebElement getStars() {
		return stars;
	}

	public void setStars(WebElement stars) {
		this.stars = stars;
	}

	public void setHotelName(WebElement hotelName) {
		this.hotelName = hotelName;
	}	

	public String getHotelName() {
		try{
		//System.out.println("Hotel: "+hotelName.getText());
		if(hotlName!=null){
		return hotlName;
		}
		return "Empty";
		}catch(NoSuchElementException e){
			return "Empty";
		}
	}
	
	public FirstRoomPage pieza(){
		try{
		System.out.println("Hptel 2 Antesito"+hotelName.getText());
		Thread.sleep(2500);
		getWait().until(ExpectedConditions.elementToBeClickable(hotelName));
		System.out.println("Nombre Hotel 2"+hotelName.getText());
		this.hotlName=hotelName.getText();		
		getWait().until(ExpectedConditions.elementToBeClickable(hotelRooms));
		clickOnHotelRooms();
		return new FirstRoomPage(getDriver());
	    }catch(TimeoutException e){
		return new FirstRoomPage(getDriver());
		}catch(NoSuchElementException e){
		return new FirstRoomPage(getDriver());	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			return new FirstRoomPage(getDriver());
		}	
		
	}

	private void clickOnHotelRooms() {
		hotelRooms.click();
		
	}

}
