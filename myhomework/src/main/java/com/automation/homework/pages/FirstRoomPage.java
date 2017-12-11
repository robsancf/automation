package com.automation.homework.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstRoomPage extends BasePage {

	public FirstRoomPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html/body/div[4]/div[6]/section/section[2]/article[2]/div/div/div[3]/div[2]/a")
	private WebElement firstRoom;
	
	public FirstRoomDetailPage seleccionar(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(firstRoom));
		clickOnFirstRoom();
		return new FirstRoomDetailPage(getDriver());
		
		}catch(TimeoutException e){
			return new FirstRoomDetailPage(getDriver());
		}catch(NoSuchElementException e){
			return new FirstRoomDetailPage(getDriver());
		}
	}

	private void clickOnFirstRoom() {
		// TODO Auto-generated method stub
		firstRoom.click();
	}

}
