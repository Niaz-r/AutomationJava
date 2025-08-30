package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	public static String url = "https://demoqa.com/automation-practice-form";
	 protected static WebDriver driver;

	    @BeforeSuite
	    public static void setupDriver() {
	    	
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        
	        PageDriver.getInstance().setDriver(driver);
	        
	        
	    }
	    
	    @AfterSuite
	    public void tearDown() {
	       // if (driver != null) 
	    	{
	    		PageDriver.getCurrentDriver().quit();
	        }
	    }
}
