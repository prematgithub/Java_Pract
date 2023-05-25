package com.globalSQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SamplePage {
	MainPage homePage = new MainPage();

	@BeforeTest
	public void openApplication() {
		homePage.openApllication("https://www.globalsqa.com/samplepagetest/");
		System.out.println("SampleTest Application Page Opened ");
	}

	@Test
	public void enterData() throws Exception {
		// Enter name
		homePage.clickOnElement("//input[@class='name']");
		homePage.enterDataInTextField("//input[@class='name']", "Prem");
		// Enter email
		homePage.clickOnElement("//input[@class='email']");
		homePage.enterDataInTextField("//input[@class='email']", "Prem@gmail.com");
		// Enter website
		homePage.clickOnElement("//input[@class='url']");
		homePage.enterDataInTextField("//input[@class='url']", "https://www.usemultiplier.com/");
		// Selecting experience from drop down list
		homePage.selectValueFromDropDown("//select[@class='select']", "3-5");
		// Scroll down to find required element
		// homePage.scrollDown(0, -200);

		// Enter comment
		homePage.enterDataInTextField("//textarea[@class='textarea']",
				"I have Experience of 3+ years in software testing.");

		// homePage.driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		// homePage.driver.findElement(By.xpath("//input[@type='radio']")).click();

		homePage.clickOnElement("//*[text()='Alert Box : Click Here']");
		Thread.sleep(3000);
		homePage.driver.switchTo().alert().accept();
		Thread.sleep(3000);
		homePage.driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String ActualMessage = homePage.driver.findElement(By.xpath("//div[@class='twelve columns']/div[2]/h3"))
				.getText();
		System.out.println(ActualMessage);
		Assert.assertEquals(ActualMessage, "Message Sent (go back)");
	}

	@AfterTest
	public void closeApplication() throws Exception {
		homePage.closeBrowser();
	}

	public void CloseAllAds() {
		List<WebElement> allAds = homePage.getListOfWebElements("//div[@title=\"Advertisement\"]/iframe");
		if (allAds.size() > 0) {
			System.out.println(allAds.size() + " Ads are available");
			for (int i = 0; i < allAds.size(); i++) {
				homePage.driver.switchTo().frame(i);
				System.out.println("Switched to ad " + i);
				if (homePage.driver.findElement(By.xpath("//div[@role='button']")).isEnabled()) {
					homePage.driver.findElement(By.xpath("//div[@role='button']")).click();
					System.out.println("Closed ad " + i);
				}

			}
		}
	}

	public void SelectRadioButton() {
		List<WebElement> Education = homePage.getListOfWebElements("//input[@type='radio']");
		for (int i = 0; i < Education.size(); i++) {
			System.out.println(Education.get(i).getAttribute("value"));
			if (Education.get(i).getAttribute("value").equalsIgnoreCase("graduate")) {
				// Education.get(i).click();
				// break;
			}
		}
	}

	public void selctionOfCheckBoxes() {
		List<WebElement> expertise = homePage.driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement skill : expertise) {
			System.out.println(skill.getAttribute("value"));
			if (skill.getAttribute("value").equalsIgnoreCase("functional Testing") && skill.isDisplayed() == true) {
				WebDriverWait wait = new WebDriverWait(homePage.driver, 60);
				wait.until(ExpectedConditions.elementToBeClickable(skill));
				homePage.driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			}

		}

	}
}
