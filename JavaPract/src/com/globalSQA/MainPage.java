package com.globalSQA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainPage {
	static WebDriver driver;

	public void openApllication(String URL) {
		// Setting chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void clickOnElement(String xpathkey) {
		driver.findElement(By.xpath(xpathkey)).click();
	}
	public void enterDataInTextField(String xpathKey, String testData) {
		driver.findElement(By.xpath(xpathKey)).sendKeys(testData);
	}
	public List<WebElement> getListOfWebElements(String xpathkey) {
		return driver.findElements(By.xpath(xpathkey));

	}
	public void clickListElement(String xpathKey, String testData) {
		List<WebElement> allElements = driver.findElements(By.xpath(xpathKey));
		for (int i = 0; i < allElements.size(); i++) {
			if (allElements.get(i).getText()== testData){
				
				allElements.get(i).click();
				System.out.println("Clicked element");
				break;
			}
		}

	}
	public void scrollDown(int xAxis,int yAxis) {
		//Type casting driver from webDriver to JavascriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down
		jse.executeScript("window.scrollBy(xAxis,yAxis)");
	}
	public void selectValueFromDropDown(String xpathkey, String Value) {
		//Selecting Value by visible from drop down list
		WebElement dropDownElement= driver.findElement(By.xpath(xpathkey));
		Select select= new Select(dropDownElement);
		select.selectByVisibleText(Value);
	}
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
		System.out.println("Browser is closed");
	}
}
