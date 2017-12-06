package com.automation.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
	
private WebDriver driver;
	
	public MyDriver(String browser){
		int val=0;
		if (browser.equals("firefox"))
			val=1;
		else if (browser.equals("chrome"))
			val=2;
		switch (val) {
		case 1:
			System.setProperty("webdriver.gecko.driver", "\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case 2:
			System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("test-type");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-web-security");
            options.addArguments("--allow-running-insecure-content");
			driver=new ChromeDriver(options);
			break;
		default:
			break;
		}
	}
	
	public WebDriver getDriver(){
		return this.driver;
	}
}
