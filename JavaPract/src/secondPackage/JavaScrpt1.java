package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrpt1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//Handling cookies
		driver.manage().deleteAllCookies();
		
		
		//Type casting driver from webDriver to JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//finding element using JavascriptExecutor
		jse.executeScript("document.getElementById('email').value='asdfghj'");
		jse.executeScript("document.getElementById('pass').value='123456'");
		
		//clicking web elemnet using javascript
		//jse.executeScript("document.getElementByName('login').click()");
		
		Thread.sleep(5000);
		//scroll up
		jse.executeScript("window.scrollBy(20,300)");
		
		Thread.sleep(5000);
		//scroll down
		jse.executeScript("window.scrollBy(0,-400)");
	}

}
