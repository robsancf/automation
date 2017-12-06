package com.automation.homework.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightSelectedObjectPage extends BasePage {

	public FlightSelectedObjectPage(WebDriver pDriver) {
		super(pDriver);
		
	}
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[7]/ul/li[3]/div[2]/div/div[2]/div/button")
	private WebElement selectedButton;
	
	
	@FindBy(id="forcedChoiceNoThanks")
	private WebElement noThanksLink;


	public void setInformationPage(FlightInformationPage informationPage) {
	}

	public WebElement getSelectedButton() {
		return selectedButton;
	}

	public void setSelectedButton(WebElement selectedButton) {
		this.selectedButton = selectedButton;
	}

	public WebElement getNoThanksLink() {
		return noThanksLink;
	}
	
	private void clickOnNothanksLink() {
		
		noThanksLink.click();
	}

	public void setNoThanksLink(WebElement noThanksLink) {
		this.noThanksLink = noThanksLink;
	}
	
	public FlightInformationPage seleccionar(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(selectedButton));
		clickOnSelectedButton();
		if(noThanksLink!=null){
		getWait().until(ExpectedConditions.elementToBeClickable(noThanksLink));
		clickOnNothanksLink();
		
		}
		
		}catch(TimeoutException e){
		
		   return new FlightInformationPage(getDriver());
		
		}
		catch(StaleElementReferenceException e){
			
		return new FlightInformationPage(getDriver());
		
		}
		return new FlightInformationPage(getDriver());
	}

	private void clickOnSelectedButton() {
		selectedButton.click();
		
	}


	

	

}
