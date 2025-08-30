package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.driver.BaseDriver;
import com.driver.PageDriver;
import com.page.LoginPage;

public class LoginTest extends BaseDriver{
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	//	Thread.sleep(5000);
		
		
	}
	
	@Test
	public void loginTest() {
		
		LoginPage loginPage = new LoginPage();
		loginPage.login();
		
		
	}

}
