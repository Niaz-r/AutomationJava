package com.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.util.Assert;
import com.driver.PageDriver;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import com.utility.CommonMethods;
import com.utility.GetScreenShots;

import net.bytebuddy.asm.Advice.This;

public class LoginPage extends CommonMethods {
	
	
	ExtentTest test;
	
	
	// PageFactory initialize
	// Page locator
	//funtionalityeded
	
	public LoginPage(ExtentTest test)
	{
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
		this.test =test;
		
	}
	
//	
//	@FindBys({
//		
//		@FindBy(xpath = "//*[@id=\"firstName\"]"),
//		@FindBy(id = "firstName")
//		
//		
//	})WebElement firstName;
//	
	
	@FindBy(xpath = "//*[@id=\"firstName\"]")WebElement firstName;
	
	
		@FindBy(xpath = "//*[@id=\"lastName\"]"
		)WebElement lastName;
	
	

		@FindBy(xpath = "//*[@id=\"submit\"]")
		WebElement submitBtn;
	
	
	public void login() throws InterruptedException, Exception {
		
		try {
			
			if(firstName.isDisplayed()) {
				firstName.sendKeys("Niaz");
				sleep(2000);
				test.pass("test.pass(\"<p style=\\\"color:#28A745; font-size:13px; font-weight:bold;\\\"><b>First Name is found successfully!</b></p>\");\n");
				   String screenshotPath = GetScreenShots.capture(PageDriver.getCurrentDriver(), "FirstName");
			        String dest = System.getProperty("user.dir") + "\\ScreenShots\\" + "FirstName.png";
			        test.pass("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			}
			
		} catch (Exception e) {
			  test.fail("<p style=\"color:#FF3535; font-size:13px\"><b>First Name is not founded " + e.getMessage() + "</b></p>");
			  
			  Throwable t= new InterruptedException("Exception");
			  test.fail(t);
			  @SuppressWarnings("unused")
			  
			    String screenshotPath = GetScreenShots.capture(PageDriver.getCurrentDriver(), "FirstName");
		        String dest = System.getProperty("user.dir") + "\\ScreenShots\\" + "FirstName.png";
			    test.fail("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			 //   Assert.class (firstName.isDisplayed());
			    PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(lastName.isDisplayed()) {
				
				lastName.sendKeys("Rahaman");
				sleep(2000);
				test.pass("test.pass(\"<p style=\\\"color:#28A745; font-size:13px; font-weight:bold;\\\"><b>Lastt Name is found successfully!</b></p>\");\n");
				  String screenshotPath = GetScreenShots.capture(PageDriver.getCurrentDriver(), "LastName");
			        String dest = System.getProperty("user.dir") + "\\ScreenShots\\" + "LastName.png";
				    test.pass("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				 
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			test.fail("<p style=\"color:#FF3535; font-size:13px\"><b>Last is not founded " + e.getMessage() + "</b></p>");
			  
			  Throwable t= new InterruptedException("Exception");
			  test.fail(t);
			  @SuppressWarnings("unused")
			  
			    String screenshotPath = GetScreenShots.capture(PageDriver.getCurrentDriver(), "LastName");
		        String dest = System.getProperty("user.dir") + "\\ScreenShots\\" + "LastName.png";
			    test.fail("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			 //   Assert.class (firstName.isDisplayed());
			    PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(submitBtn.isDisplayed())
			{
				submitBtn.click();
				sleep(2000);
				   String screenshotPath = GetScreenShots.capture(PageDriver.getCurrentDriver(), "submitbatton");
			        String dest = System.getProperty("user.dir") + "\\ScreenShots\\" + "submitbutton.png";
				    test.pass("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			}
		} catch (Exception e) {
			// TODO: handle exception
			test.fail("<p style=\"color:#FF3535; font-size:13px\"><b>Submit Button Name is not founded " + e.getMessage() + "</b></p>");
			  
			  Throwable t= new InterruptedException("Exception");
			  test.fail(t);
			  @SuppressWarnings("unused")
			  
			    String screenshotPath = GetScreenShots.capture(PageDriver.getCurrentDriver(), "submitbatton");
		        String dest = System.getProperty("user.dir") + "\\ScreenShots\\" + "submitbutton.png";
			    test.fail("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			 //   Assert.class (firstName.isDisplayed());
			    PageDriver.getCurrentDriver().quit();
		}
		
	}
	
	
	
	
	
}
