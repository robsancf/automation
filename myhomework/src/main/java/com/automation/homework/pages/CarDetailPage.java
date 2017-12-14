package com.automation.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarDetailPage extends BasePage {

	public CarDetailPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="total-selected-price")
	private WebElement price;
	
	private String precio;
	
	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

	public WebElement getPrice() {
		try{
	    
		//WebElement price=getDriver().findElement(By.id("total-selected-price"));
		Thread.sleep(2500);
		this.precio=price.getText();
		return price;
		}catch(TimeoutException e){
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return price;
		}catch(NoSuchElementException e){
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return price;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
//	public void setPrice(WebElement price) {
//		this.price = price;
//	}

}
