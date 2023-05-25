package firstPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		//Handling alerts
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		//Accepting alert
		driver.switchTo().alert().accept();
		
		//dismissing alert
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
