package com.globalSQA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePicker {

	MainPage mp;

	@BeforeClass
	public void basicSetting() {
		mp = new MainPage();
		mp.openApllication("https://www.globalsqa.com/demo-site/datepicker/");
	}

	@Test(enabled = true)
	public void pickDate() {

		WebElement iframe = mp.driver.findElement(By.className("demo-frame"));
		mp.driver.switchTo().frame(iframe);

		WebDriverWait wait = new WebDriverWait(mp.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(mp.driver.findElement(By.xpath("//*[@id='datepicker']"))));
		mp.clickOnElement("//*[@id='datepicker']");
		String expectedMonth = "July 2023";
		String expectedDay = "19";
		while (true) {
			String month = mp.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			if (month.equalsIgnoreCase(expectedMonth)) {
				mp.clickOnElement("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a");
				// mp.scrollDown(1,-400);
				// mp.clickListElement("//div[@id='ui-datepicker-div']/table[1]/tbody[1]/tr/td/a",
				// expectedDay);

				break;
			} else {
				mp.clickOnElement("//*[@id='ui-datepicker-div']/div/a[2]");
			}
		}

	}

	@Test
	public void pickDateFromDropDown() {
		// pick up month and year from drop down and date from table
		mp.driver.navigate().refresh();
		mp.clickOnElement("//li[@id='DropDown DatePicker']");

		WebDriverWait wait = new WebDriverWait(mp.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(
				mp.driver.findElement(By.xpath("//div/div[@class='resp-tabs-container']/div[2]/p/iframe"))));

		WebElement iframe = mp.driver.findElement(By.xpath("//div/div[@class='resp-tabs-container']/div[2]/p/iframe"));
		mp.driver.switchTo().frame(iframe);
		System.out.println("switched to frames");
		wait.until(ExpectedConditions.visibilityOf(mp.driver.findElement(By.xpath("//html/body/p/input"))));
		mp.clickOnElement("//html/body/p/input");

		// Select month from drop down list
		mp.selectValueFromDropDown("//select[@class='ui-datepicker-month']", "Aug");

		// select year dfrom drop down list
		mp.selectValueFromDropDown("//select[@class='ui-datepicker-year']", "2020");

		// select day
		mp.clickOnElement("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[5]/a");

	}

	@AfterClass
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		mp.driver.quit();
	}
}
