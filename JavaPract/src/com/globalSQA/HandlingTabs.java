package com.globalSQA;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HandlingTabs {

	MainPage homePage = new MainPage();

	@Test
	public void performOperations() {
		// open tabs page
		homePage.openApllication("https://www.globalsqa.com/demo-site/accordion-and-tabs/");
		System.out.println("Opened application");
		//homePage.driver.findElement(By.xpath("/html/body/div[1]/h3[1]"));
		//homePage.clickOnElement("//div[@id='accordion']/h3");

		/*
		 * List<WebElement> allSections =
		 * homePage.getListOfWebElements("//div[@id='accordion']/h3"); for (WebElement
		 * section : allSections) { section.click(); }
		 */
	}
	@AfterMethod
	public void closeApplication() throws Exception {
		homePage.closeBrowser();
	}
}

	
