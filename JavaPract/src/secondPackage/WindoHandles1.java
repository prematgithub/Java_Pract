package secondPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandles1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();

		// How many windows are opened currently
		Set<String> windowsIds = driver.getWindowHandles();// There will be no duplicates
		System.out.println(windowsIds);
		System.out.println("Total no of windows "+windowsIds.size());
		Thread.sleep(3000);
		// driver.quit();// will close all windows
		System.out.println(driver.getWindowHandle().isEmpty());
		
		Iterator<String> wins = windowsIds.iterator();
		String win1 = wins.next();
		String win2 = wins.next();
		
		//print the title of window
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		driver.close();// will close current window only
		
		driver.switchTo().window(win1);
		System.out.println(driver.getTitle());
		driver.close();// will close current window only
		
		
	}

}
