package com.automation.homework.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.homework.pages.FlightSearchHomePage;
import com.automation.homework.pages.MyDriver;

public class BaseTest {
	
	MyDriver myDriver;
	private FlightSearchHomePage home;
	
	
	@BeforeSuite(alwaysRun=true)
    @Parameters({"browser"})
	public void beforeSuite(String browser){
		myDriver = new MyDriver(browser);
		home = new FlightSearchHomePage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite(){
		home.dispose();
	}
	
	public FlightSearchHomePage getHomePage(){
		return home;
	}

}
