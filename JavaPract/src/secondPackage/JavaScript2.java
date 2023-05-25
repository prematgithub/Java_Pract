package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		// Clicking element using Javascript
		try {
			jse.executeScript("arguments[0].click()", loginButton);
		} catch (Exception e) {
			
		}
		
		// Enetering email using javascript
		jse.executeScript("document.getElementById('ap_email').value='7741957237'");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		//jse.executeScript("arguments[0].click()", driver.findElement(By.id("continue")));
		
		//System.out.println("Got Error for incorrect details "+ driver.findElement(By.xpath("//*[@id='auth-error-message-box']/div/div")).getText());
		
		// Enetering password using javascript
		jse.executeScript("document.getElementById('ap_password').value=123456");
		jse.executeScript("arguments[0].click()", driver.findElement(By.id("signInSubmit")));
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
