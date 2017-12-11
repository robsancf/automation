package com.automation.homework.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstRoomDetailPage extends BasePage {

	public FirstRoomDetailPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html/body/div[1]/div[6]/section/div[7]/ul/li[1]/div[2]/div/div[2]/div/button")
	private WebElement selectButtonFirst;
	
	@FindBy(xpath="/html/body/div[1]/div[6]/section/div[7]/ul/li[3]/div[2]/div/div[2]/div/button")
	private WebElement selectButtonThird;
	
	@FindBy(id="primary-header-car")
	private WebElement carLink;
	
	
	public CarPage seleccionar(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(selectButtonFirst));
		clickOnSelectButtonFirst();
		getWait().until(ExpectedConditions.elementToBeClickable(selectButtonThird));
		clickOnSelectButtonThird();
		getWait().until(ExpectedConditions.elementToBeClickable(carLink));
		clickOnCarLink();
		return new CarPage(getDriver());
		}catch(TimeoutException e){
		  return new CarPage(getDriver());
		}catch(NoSuchElementException e){
		  return new CarPage(getDriver());	
		}
	
		
	}


	private void clickOnCarLink() {
		// TODO Auto-generated method stub
		carLink.click();
	}


	private void clickOnSelectButtonThird() {
		// TODO Auto-generated method stub
		selectButtonThird.click();
	}


	private void clickOnSelectButtonFirst() {
		// TODO Auto-generated method stub
		selectButtonFirst.click();
	}
	
	

}
