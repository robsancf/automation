package com.automation.homework.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarPage extends BasePage {

	public CarPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="ember1402")
	private WebElement selectButton;
	
	public CarDetailPage detalle(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(selectButton));
		clickOnSelectButton();
		return new CarDetailPage(getDriver());
		}catch(TimeoutException e){
			return new CarDetailPage(getDriver());
		}catch(NoSuchElementException e){
			return new CarDetailPage(getDriver());
		}
		
	}

	private void clickOnSelectButton() {
		// TODO Auto-generated method stub
		selectButton.click();
	}
	

}
