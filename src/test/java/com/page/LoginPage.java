package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.driver.PageDriver;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import com.utility.CommonMethods;

import net.bytebuddy.asm.Advice.This;

public class LoginPage extends CommonMethods {
	
	
	// PageFactory initialize
	// Page locator
	//funtionalityeded
	
	public LoginPage()
	{
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
		
		
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
	
	
	public void login() {
		
		try {
			
			if(firstName.isDisplayed()) {
				firstName.sendKeys("Niaz");
				sleep(2000);
				
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			if(lastName.isDisplayed()) {
				
				lastName.sendKeys("Rahaman");
				sleep(2000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			if(submitBtn.isDisplayed())
			{
				submitBtn.click();
				sleep(2000);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	
	
	
	
}
