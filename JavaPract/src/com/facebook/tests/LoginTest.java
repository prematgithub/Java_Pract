package com.facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;
import com.facebook.resources.DataProviderClass;

public class LoginTest {
	LoginPage lp;
	String username, password;

	@BeforeClass
	public void beforclass() throws Exception {
		lp = new LoginPage();
	}

	// we are mentioned dataprovider class also
	@Test(dataProvider = "readExcelFile", dataProviderClass = com.facebook.resources.DataProviderClass.class)
	public void loginTest(String username, String password) throws Exception {
		// Create object of LoginPage

		MasterPage.driver.navigate().refresh();
		lp.clearEmailOrPhone();
		lp.clearPassword();
		
		lp.clickEmailOrPhone();
		lp.enterEmailOrPhone(username);
		lp.clickPassword();
		lp.enterPassword(password);
		lp.clickLoginButton();

		lp.verifyAssertionTrue("LoginButton");
		//System.out.println("User is not able to login");

	}
	@AfterMethod
	public void takeScreenShotOfTest(ITestResult result) throws Exception
	{
	lp.takeScreenShotOnFailure(result);	
	}

	@AfterClass
	public static void closeLoginPage() throws Exception {
		Thread.sleep(5000);
		MasterPage.driver.close();
	}

}
