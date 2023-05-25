package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("123456");

		// Use explicit wait to check password datafield is visible or not
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("werty");

		// Use explicity wait to check entered password to show
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@role='button']/div/div"))).click();
		
		//get entered text and match with expected then click login button
		String expectPass = "werty";
		Thread.sleep(3000);
		System.out.println("Text entered is "+driver.findElement(By.id("pass")).getAttribute("value"));
		if (expectPass.equals(driver.findElement(By.id("pass")).getAttribute("value"))) {
			driver.findElement(By.name("login")).click();

		}

	}

}
