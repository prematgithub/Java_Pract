package com.facebook.genericPage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;

public class CommonFunctions extends MasterPage {

	public CommonFunctions() throws Exception {
		super();
	}

	// Click method which accepts xpath of webelement xpath
	public void click(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).click();
	}

	// EnterData method accepts xpath and test data
	public void enterData(String xpathKey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).sendKeys(testData);
	}

	// Clear text datafield
	public void clear(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).clear();
	}

	// Move to element usin actions class
	public void moveToElement(String xpathKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathKey)))).build().perform();
	}

	public void clickListElement(String xpathKey, String testData) {
		List<WebElement> allElements = driver.findElements(By.xpath(or.getProperty(xpathKey)));
		for (int i = 0; i < allElements.size(); i++) {
			if (allElements.get(i).getText().equalsIgnoreCase(or.getProperty(testData))) {
				allElements.get(i).click();
				break;
			}
		}

	}

	// Used for comparing texts
	public void verifyAssertionEquals(String xpathKey, String expectedData) {
		Assert.assertEquals(driver.findElement(By.xpath(or.getProperty(xpathKey))), expectedData);
	}

	// Used if condition is true
	public void verifyAssertionTrue(String xpathKey) {
		Assert.assertTrue(driver.findElement(By.xpath(or.getProperty(xpathKey))).isDisplayed());
	}

	// Used if condition is False
	public void verifyAssertionFalse(String xpathKey) {
		Assert.assertFalse(driver.findElement(By.xpath(or.getProperty(xpathKey))).isDisplayed());
	}

	// Take screen shot of web page in case of failure
	public void takeScreenShotOnFailure(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			// Create reference of TakesScreenshot and up cast driver to TakesScreenshot
			// which is an interface
			TakesScreenshot ts = (TakesScreenshot) driver;
			// use getscreenshotAs method to capture screen shot which return in file format
			// hence stored in file format
			File screenShot = ts.getScreenshotAs(OutputType.FILE);

			// Using current date and time to uniquely identify
			String screenSHotName = getCurrentDateAndTime().replace(":", "-");
			screenSHotName = result.getName() + screenSHotName;
			// copy file to specific location
			FileHandler.copy(screenShot, new File("./ScreenShots/" + screenSHotName + ".png"));

			System.out.println(result.getName() + " Failure Screen shot captured");
		}

	}

	public void takeScreenShotOfPage(String pageTitle) throws Exception {
		// Create reference of TakesScreenshot and up cast driver to TakesScreenshot
		// which is an interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		// use getscreenshotAs method to capture screen shot which return in file format
		// hence stored in file format
		File screenShot = ts.getScreenshotAs(OutputType.FILE);

		// Using current date and time to uniquely identify
		pageTitle = pageTitle + getCurrentDateAndTime().replace(":", "-");
		// copy file to specific location
		FileHandler.copy(screenShot, new File("./ScreenShots/" + pageTitle + ".png"));
	}

	// Get Current date and time of system in yyyy-MM-dd HH:mm:ss format
	public String getCurrentDateAndTime() {
		// Get system date and time
		LocalDateTime CurrentDateAndTime = LocalDateTime.now();

		// Define format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		return CurrentDateAndTime.format(formatter);

	}
}