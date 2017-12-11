package com.automation.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarDetailPage extends BasePage {

	public CarDetailPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/span[1]")
	private WebElement price;
	
	public WebElement getPrice() {
		try{
		return price;
		}catch(TimeoutException e){
			return getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/span[1]"));
		}catch(NoSuchElementException e){
			return getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/span[1]"));
		}
	}
	public void setPrice(WebElement price) {
		this.price = price;
	}

}
