package com.automation.homework.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightSearchResultsPage extends BasePage {
	
	private WebDriver driver;
	
	public FlightSearchResultsPage(WebDriver pDriver) {
		super(pDriver);
		setDriver(pDriver);
		
	}
		
	@FindBy(name="sort")	
	private WebElement sortListBoxCombo;	

	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[1]")
	private WebElement lowestPriceSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[2]")
	private WebElement highestPriceSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[3]")
	private WebElement shortestDurationSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[4]")
	private WebElement longestDurationSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[5]")
	private WebElement departureEarliestSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[6]")
	private WebElement departureLatestSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[7]")
	private WebElement arrivalEarliestSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[2]/div[2]/div/fieldset/label/select/option[8]")
	private WebElement arrivalLatestSelectedValue;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/section/div[7]/ul/li[1]/div[2]/div/div[2]/div/button")
	private WebElement selectButton;
	
    public List<WebElement> getSelectButtons()  {
    	List<WebElement> buttonsList=new ArrayList<WebElement>();
    	try{
		int i=1;		
		Integer value=new Integer(i);
		String val=value.toString();
		String equispath="/html/body/div[2]/div[6]/section/div[7]/ul/li["+val+"]/div[2]/div/div[2]/div/button";
		WebElement element=getDriver().findElement(By.xpath(equispath));
		getWait().until(ExpectedConditions.elementToBeClickable(element));
		buttonsList.add(element);
		System.out.println("Agregado:"+equispath);
		i++;
		while(element!=null){
		    equispath="/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[2]/div/button";
		    element=getDriver().findElement(By.xpath(equispath));
		    buttonsList.add(element);
		    System.out.println("Agregado:"+equispath);
		    //getWait().until(ExpectedConditions.elementToBeClickable(element));
		    i++;

		}		
    	}catch(NoSuchElementException e){
			
			return buttonsList;
		}
		return buttonsList;
	}
	
	public List<WebElement> getFlightDurations() {
		
		List<WebElement> flightDurationsList=new ArrayList<WebElement>();
		try{
		int i=1;
		Integer value=new Integer(i);
		String val=value.toString();		
		String equispath="/html/body/div[2]/div[6]/section/div[7]/ul/li["+val+"]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]";
		WebElement element=getDriver().findElement(By.xpath(equispath));
		getWait().until(ExpectedConditions.elementToBeClickable(element));
		flightDurationsList.add(element);
		 System.out.println("Agregado:"+equispath);
		i++;		
		while(element!=null){
		    equispath="/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div[1]";
		    element=getDriver().findElement(By.xpath(equispath));
		    flightDurationsList.add(element);
		    System.out.println("Agregado:"+equispath);
		    //getWait().until(ExpectedConditions.elementToBeClickable(element));
		    i++;
		}
		}catch(NoSuchElementException e){
			
			return flightDurationsList;
		}
		return flightDurationsList;
		
	}
	
	public List<WebElement> getFlightDetailsBaggageFees(){
		
		List<WebElement> flightDetailsBaggageFeesLinks=new ArrayList<WebElement>();
		try{
		int i=1;
		WebElement element=getDriver().findElement(By.xpath("/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[2]/div/div/div[1]/span[2]"));
		flightDetailsBaggageFeesLinks.add(element);
		 System.out.println("Agregado:"+ "/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[2]/div/div/div[1]/span[2]");
		i++;		
		while(element!=null)
		{
		   element=getDriver().findElement(By.xpath("/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[2]/div/div/div[1]/span[2]"));     
		   flightDetailsBaggageFeesLinks.add(element);
		   System.out.println("Agregado:"+ "/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[2]/div/div/div[1]/span[2]");
		   i++;
		}
		}catch(NoSuchElementException e){
			
			return flightDetailsBaggageFeesLinks;
		}
		return flightDetailsBaggageFeesLinks;
		
	}
	
	public boolean ShortestDurationIsOrdered(){
		try{
		int i=1;		
		WebElement element=getDriver().findElement(By.xpath("/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div[1]"));
		getWait().until(ExpectedConditions.elementToBeClickable(element));
		String hora2;
		String segundo;
		String segundo2;
		String time=element.getText();
		System.out.println("Esta es toda la cadena"+time);
		String hora=time.substring(0,1);
		if(!time.substring(1,2).equals("h")){
	    hora2 = time.substring(1,2);
		hora=hora+hora2;
		segundo=time.substring(4,5);
		   if(!time.substring(5,6).equals("m")){
		   segundo2=time.substring(5,6);
		   System.out.println("Hora"+hora);
		   System.out.println("Segundo"+segundo);
		   System.out.println("Segundo2"+segundo2);
		   segundo=segundo+segundo2;
		   }
		   
		}
		else{
		 segundo=time.substring(3,4);
		  if(!time.substring(4,5).equals("m")){
			  segundo2=time.substring(4,5);
			  System.out.println("Hora"+hora);
			  System.out.println("Segundo"+segundo);
			  System.out.println("Segundo2"+segundo2);
			  segundo=segundo+segundo2;
		  }		
			
		}
		System.out.println("Esta es la hora:"+hora);
		System.out.println("Estos son los segundos:"+segundo);
		Integer horas=new Integer(hora);
		Integer segundos=new Integer(segundo);
		i++;
		while(element!=null){
			element=getDriver().findElement(By.xpath("/html/body/div[2]/div[6]/section/div[7]/ul/li["+i+"]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div[1]"));
			getWait().until(ExpectedConditions.elementToBeClickable(element));
			time=element.getText();
			System.out.println("Esta es toda la cadena"+time);
			hora=time.substring(0,1);
			if(!time.substring(1,2).equals("h")){
		    hora2 = time.substring(1,2);
			hora=hora+hora2;
			segundo=time.substring(4,5);
			   if(!time.substring(5,6).equals("m")){
			   segundo2=time.substring(5,6);
			   System.out.println("Hora"+hora);
			   System.out.println("Segundo"+segundo);
			   System.out.println("Segundo2"+segundo2);
			   segundo=segundo+segundo2;
			   }
			   
			}
			else{
			 segundo=time.substring(3,4);
			  if(!time.substring(4,5).equals("m")){
				  segundo2=time.substring(4,5);
				  System.out.println("Hora"+hora);
				  System.out.println("Segundo"+segundo);
				  System.out.println("Segundo2"+segundo2);
				  segundo=segundo+segundo2;
			  }
			  Integer nuevaHora=new Integer(hora);
			  Integer nuevoSegundo=new Integer(segundo);
			  if(!(nuevaHora>=horas)){
				  
				  return false;
				  
			  }
			  else{
				  
				 if(!(nuevoSegundo>=segundos)){
					 
					 return false;
				 }
				 horas=nuevaHora;
				 segundos=nuevoSegundo;
				  
			  }			  
			  i++;
					
			}			
		}
		
		return true;
		
		}catch(StaleElementReferenceException e){
			
			return true;
		
		}catch(NoSuchElementException e){
			
			return true;
			
		}catch(TimeoutException e){
			
			return true;
		}
	}
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSortListBoxCombo() {
		return sortListBoxCombo;
	}

	public void setSortListBoxCombo(WebElement sortListBoxCombo) {
		this.sortListBoxCombo = sortListBoxCombo;
	}

	public WebElement getLowestPriceSelectedValue() {
		return lowestPriceSelectedValue;
	}

	public void setLowestPriceSelectedValue(WebElement lowestPriceSelectedValue) {
		this.lowestPriceSelectedValue = lowestPriceSelectedValue;
	}

	public WebElement getHighestPriceSelectedValue() {
		return highestPriceSelectedValue;
	}

	public void setHighestPriceSelectedValue(WebElement highestPriceSelectedValue) {
		this.highestPriceSelectedValue = highestPriceSelectedValue;
	}

	public WebElement getShortestDurationSelectedValue() {
		return shortestDurationSelectedValue;
	}

	public void setShortestDurationSelectedValue(WebElement shortestDurationSelectedValue) {
		this.shortestDurationSelectedValue = shortestDurationSelectedValue;
	}

	public WebElement getLongestDurationSelectedValue() {
		return longestDurationSelectedValue;
	}

	public void setLongestDurationSelectedValue(WebElement longestDurationSelectedValue) {
		this.longestDurationSelectedValue = longestDurationSelectedValue;
	}

	public WebElement getDepartureEarliestSelectedValue() {
		return departureEarliestSelectedValue;
	}

	public void setDepartureEarliestSelectedValue(WebElement departureEarliestSelectedValue) {
		this.departureEarliestSelectedValue = departureEarliestSelectedValue;
	}

	public WebElement getDepartureLatestSelectedValue() {
		return departureLatestSelectedValue;
	}

	public void setDepartureLatestSelectedValue(WebElement departureLatestSelectedValue) {
		this.departureLatestSelectedValue = departureLatestSelectedValue;
	}

	public WebElement getArrivalEarliestSelectedValue() {
		return arrivalEarliestSelectedValue;
	}

	public void setArrivalEarliestSelectedValue(WebElement arrivalEarliestSelectedValue) {
		this.arrivalEarliestSelectedValue = arrivalEarliestSelectedValue;
	}

	public WebElement getArrivalLatestSelectedValue() {
		return arrivalLatestSelectedValue;
	}

	public void setArrivalLatestSelectedValue(WebElement arrivalLatestSelectedValue) {
		this.arrivalLatestSelectedValue = arrivalLatestSelectedValue;
	}
	
	public void orderingByShortestDuration(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(sortListBoxCombo));
		clickOnOrderingCombo();
		getWait().until(ExpectedConditions.elementToBeClickable(shortestDurationSelectedValue));
		clickOnShortestDurationSelectedValue();
		}catch(TimeoutException e){
			System.out.println("Error de Timeout");
		}catch(NoSuchElementException e){
			System.out.println("Error de carga de elemento");
			
		}
		
	}
	
	private void clickOnShortestDurationSelectedValue() {
		shortestDurationSelectedValue.click();
		
	}

	public void clickOnOrderingCombo(){
		
		sortListBoxCombo.click();
		
	}
	
	public FlightSelectedObjectPage buscar(){
		try{
		getWait().until(ExpectedConditions.elementToBeClickable(selectButton));
		clickOnSelectButton();
		return new FlightSelectedObjectPage(getDriver());
		}catch(TimeoutException e){
			
			return null;
		}
		
	}

	private void clickOnSelectButton() {
		
		selectButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
