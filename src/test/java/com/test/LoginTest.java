package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.driver.BaseDriver;
import com.driver.PageDriver;
import com.page.LoginPage;
import com.utility.ExtentFactory;

public class LoginTest extends BaseDriver{
	
	
	ExtentReports report;
	ExtentTest parentTest,childTest;
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	//	Thread.sleep(5000);
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<span style=\\\"color:#1E90FF; font-size:16px; font-weight:bold;\\\">Main Test Title</span>");
		
		
		
	}
	
	@Test
	public void loginTest() throws InterruptedException, Exception {
		
		childTest = parentTest.createNode("<span style=\"color:#FF8C00; font-size:14px; font-weight:bold;\">Login Test</span>");

		
		LoginPage loginPage = new LoginPage(childTest);
		loginPage.login();
		
		
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	

}
