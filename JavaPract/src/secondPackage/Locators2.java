package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91774\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//css selectors
		/*driver.findElement(By.cssSelector("#email")).sendKeys("prem@gmail.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		*/
		
		driver.findElement(By.xpath("//*[contains(@id,'createacc')]")).click();
		driver.findElement(By.xpath("//*[starts-with(@id,'usernamereg-firstName')]")).sendKeys("Prem");
	}

}
//*[starts-with(@id,'usernamereg-firstName')]
//*[contains(@id,'createacc')]