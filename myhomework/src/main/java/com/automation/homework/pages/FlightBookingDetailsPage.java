package com.automation.homework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBookingDetailsPage extends BasePage {

	public FlightBookingDetailsPage(WebDriver pDriver) {
		super(pDriver);
		
	}
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[1]/form/fieldset/fieldset/div/fieldset[1]/label[1]/span")
	private WebElement firstNameLabel;
	
	@FindBy(id="firstname[0]")
	private WebElement firstName;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[1]/form/fieldset/fieldset/div/fieldset[1]/label[1]/p")
	private WebElement firstNameValidation;
	
	@FindBy(xpath="middlename[0]")
	private WebElement middleName;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[1]/form/fieldset/fieldset/div/fieldset[1]/label[3]/span")
	private WebElement lastNameLabel;
	
	@FindBy(id="lastname[0]")
	private WebElement lastName;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[1]/form/fieldset/fieldset/div/fieldset[1]/label[3]/p")
	private WebElement lastNameValidation;
	
	@FindBy(id="phone-number[0]")
	private WebElement phoneNumber;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[1]/form/fieldset/fieldset/div/label[2]/p")
	private WebElement phoneNumberValidation;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[5]/fieldset/div[3]/div[2]/div[2]/form/fieldset/div[1]/div/div[3]/div/fieldset/label[1]/input")
	private WebElement cardHolderName;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[5]/fieldset/div[3]/div[2]/div[2]/form/fieldset/div[1]/div/div[3]/div/fieldset/label[1]/p")
	private WebElement cardHolderNameValidation;
	
	@FindBy(id="creditCardInput")
	private WebElement creditCard;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/div[8]/section[2]/article[5]/fieldset/div[3]/div[2]/div[2]/form/fieldset/div[1]/div/div[3]/div/fieldset/label[2]/p")
	private WebElement creditCardValidation;
	
	public boolean isValidatedFirstName(){
		try{		

		if(firstNameValidation!=null){
			
			return true;
		}
		}catch(TimeoutException e){
		return false;
		}catch(NoSuchElementException e){
		return false;
		}
		return true;
	}
	public boolean isValidatedLastName(){
		try{
				if(lastNameValidation!=null){
					
					return true;
				}
		}catch(TimeoutException e){
				return false;
		}catch(NoSuchElementException e){
			  return false;
		}
		return false;
	}
	public boolean isValidatedPhoneNumber(){
		try{
			if(phoneNumberValidation!=null){
					
					return true;
				}
		}catch(TimeoutException e){		
				return false;
		}catch(NoSuchElementException e){
			  return false;
		}
		return false;
	}
	public boolean isValidatedCardHolderName(){
		try{
			if(cardHolderNameValidation!=null){
						
						return true;
					}
			}catch(TimeoutException e){		
					return false;
			}catch(NoSuchElementException e){
				  return false;
			}
			return false;		
	}
	public boolean isValidatedCreditCard(){
		try{
			if(creditCardValidation!=null){
						
						return true;
					}
			}catch(TimeoutException e){		
					return false;
			}catch(NoSuchElementException e){
				  return false;
			}
			return false;
		
	}
	public void activateValidations(){
		try{
		firstName.sendKeys(Keys.TAB);
		middleName.sendKeys(Keys.TAB);
		lastName.sendKeys(Keys.TAB);
		}catch(TimeoutException e){		
			
	    }catch(NoSuchElementException e){
		  
	    }
		
	}
	

}
