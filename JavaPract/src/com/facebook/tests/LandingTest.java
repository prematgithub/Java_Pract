package com.facebook.tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;

public class LandingTest {
	LoginPage lp;
	

	@BeforeClass
	public void beforclass() throws Exception {
		lp = new LoginPage();
	}
	@Test
	public void landingPageTest() throws Exception {
		
		String actualTitle =lp.driver.getTitle();
		System.out.println(actualTitle);
		String CurrentDateAndTime=lp.getCurrentDateAndTime();
		String converted=CurrentDateAndTime.replace(":", "-");
		System.out.println(converted);
		lp.takeScreenShotOfPage(actualTitle);
		Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
		
	}
	@AfterMethod
	public void takeScreenShotOfTest(ITestResult result) throws Exception
	{
	lp.takeScreenShotOnFailure(result);	
	}
	@AfterClass
	public void closeBrowser() {
		lp.driver.quit();
	}
	
}
