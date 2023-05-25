package firstPacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello1 {

	public static void main(String[] args) {
		System.out.println("Hello");

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.findElement(By.xpath("//button[@name='login'")).click();

		// WEB ELEMENT METHODS
		// used to maximize browser instance
		driver.manage().window().maximize();

		// used to launch appln
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
	}

}
