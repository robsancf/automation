package com.automation.homework.pages;

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
	
	public boolean closePopUp(){
		try{
		if(noThanksLink!=null){
		getWait().until(ExpectedConditions.elementToBeClickable(noThanksLink));
		clickOnNothanksLink();
		return true;
		}
		}catch(TimeoutException e){
		
			return false;
		
		}
		return false;
	}

	

	

}
