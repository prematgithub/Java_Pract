package secondPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitAndSuggestions {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Best batsman");
		List<WebElement> autoList = driver.findElements(By.xpath("//div/ul[@role='listbox']/li"));
		System.out.println("All no suggetion " + autoList.size());
		Thread.sleep(5000);
		for (int i = 0; i < autoList.size(); i++) {
			String expected = "Best batsman in IPL";
			// System.out.println(autoList.get(i).getText());
			if (autoList.get(i).getText().equalsIgnoreCase(expected)) {
				autoList.get(i).click();
				break;
			}
		}

	}
}
