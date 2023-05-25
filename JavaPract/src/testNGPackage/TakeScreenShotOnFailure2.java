package testNGPackage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenShotOnFailure2 {
	
	
	TakeScreenShotOnFailure1 ts1= new TakeScreenShotOnFailure1();
	@Test
	public  void doLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		ts1.driver= new ChromeDriver();
		ts1.driver.manage().window().maximize();
		ts1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ts1.driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(3000);
		ts1.driver.findElement(By.id("email")).sendKeys("Hello@gmail.com");
		ts1.driver.findElement(By.id("pass")).sendKeys("1234567");
		ts1.driver.findElement(By.name("login1")).click();
	}
	
	@AfterMethod
	public void takeScreenShotOnfailure(ITestResult result2) throws Exception {
		ts1.captureScreenShot(result2);
	}

}
