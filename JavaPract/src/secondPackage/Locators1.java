package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class Locators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		//Implicit wait implementation
		
		Options opt=driver1.manage();
		Timeouts time= opt.timeouts();
		time.implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//id
		driver1.findElement(By.id("email")).sendKeys("ASDFGH");
		//complete xpath
		driver1.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/div/input[@id='pass']")).sendKeys("123456");
		//partial
		driver1.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		System.out.println(driver1.findElement(By.xpath("//label[@class='_58mt']")).getText());

	}
	
}
