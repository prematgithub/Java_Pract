package secondPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {

	public static void main(String[] args) throws Exception {

		String browser = "Chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println(" we are opening Chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\eclipse-workspace\\chromedriver.exe");
			// System.setProperty("ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY",
			// "C:\\Users\\91774\\eclipse-workspace\\");
			ChromeDriver driver1 = new ChromeDriver();
			driver1.get("https://www.facebook.com/");
			driver1.findElement(By.id("email")).sendKeys("ASDFGH");
			driver1.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/div/input[@id='pass']")).sendKeys("123456");
			Thread.sleep(4000);
			driver1.findElement(By.id("email")).clear();
			
			
		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91774\\eclipse-workspace\\geckodriver.exe");
			FirefoxDriver driver2 = new FirefoxDriver();
			driver2.get("https://www.naukri.com/mnjuser/homepage");
			
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\91774\\eclipse-workspace\\msedgedriver.exe");
			EdgeDriver driver3 = new EdgeDriver();
			driver3.get("https://www.youtube.com/");
		}
	}

}
