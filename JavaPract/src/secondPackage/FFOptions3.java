package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FFOptions3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91774\\eclipse-workspace\\geckodriver.exe");
		FirefoxOptions options= new FirefoxOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ASDFGH");
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/div/input[@id='pass']")).sendKeys("123456");
		driver.quit();
		
	}

}
