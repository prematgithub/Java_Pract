package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSim {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//html/body/div[2]/div/div/button")).click();

		WebElement fashion = driver.findElement(By.xpath("//*[text()='Fashion']"));
		
		Actions act= new Actions(driver);
		
		//mouse hover on fashion
		Thread.sleep(2000);
		act.moveToElement(fashion).build().perform();
		
		
		//right click on web page
		Thread.sleep(2000);
		//act.contextClick(fashion).build().perform();
		
		Thread.sleep(2000);
		//releasing control
		act.release(fashion).build().perform();
		
		//keyboard buttons
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement Login= driver.findElement(By.xpath("//*[text()='Login']"));
		Thread.sleep(2000);
		act.sendKeys(Login,Keys.ENTER).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//html/body/div[2]/div/div/button")).click();
		 
		act.click(Login);
		
		//entering mobile no
		WebElement mobileNo= driver.findElement(By.xpath("//form/div/input[@type='text']"));
		mobileNo.sendKeys("7451957237");
		Thread.sleep(5000);
		//
		WebElement requestOTP= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		act.click(requestOTP).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
