package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption1 {

	public static void main(String[] args) {
		// Log file
		ChromeOptions options =new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\eclipse-workspace\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "C:\\Users\\91774\\Logs\\Chromelogs.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

}
