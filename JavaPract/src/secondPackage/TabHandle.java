package secondPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();

		Set<String> allWins = driver.getWindowHandles();
		System.out.println(allWins);

		Iterator<String> wins = allWins.iterator();

		while (wins.hasNext()) {
			driver.switchTo().window(wins.next());
			System.out.println("Title of  tab is " + driver.getTitle());
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
