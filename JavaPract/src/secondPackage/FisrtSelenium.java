package secondPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FisrtSelenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.findElement(By.xpath("//button[@name='login'")).click();

		// WEB ELEMENT METHODS
		// used to maximize browser instance
		driver.manage().window().maximize();

		// used to launch appln
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		/*
		 * The difference between navigate and get method get() is used to navigate
		 * particular URL(website) and wait till page load. driver. navigate() is used
		 * to navigate to particular URL and does not wait to page load. It maintains
		 * browser history or cookies to navigate back or forward. Launching appln using
		 * navigate method
		 */

		// Get current page URl
		String url = driver.getCurrentUrl();
		System.out.println("Current url is " + url);

		// Refresh the page
		Thread.sleep(3000);
		driver.navigate().refresh();

		// navigate back
		Thread.sleep(3000);
		driver.navigate().back();

		// navigate forward
		Thread.sleep(3000);
		driver.navigate().forward();

		// Getting title of current
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(3000);
		// Closing single browser instance
		// driver.close();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12346");

		Thread.sleep(5000);
		driver.quit();

	}

}
