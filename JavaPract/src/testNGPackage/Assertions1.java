package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.junit.Assert;

public class Assertions1 {

	@Test
	public void testCase1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?");

		driver.findElement(By.id("login-username")).sendKeys("Hello@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();

		String actualError = driver.findElement(By.id("username-error")).getText();

		String expectedError = "Sorry, we don't recognize this email.";

		// equal assertion if both contions are equal it pass test if assertion shows
		// deprecated warning the use "import org.junit.Assert;"
		Assert.assertEquals(expectedError, expectedError);
		
		System.out.println("Assertion Equal Verified");

		// true assertion if this condition is true it will pass test
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("Assertion True Verified");

		// False assertions if this condition is false it will pass test
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("Assertion false Verified");
	}

}
