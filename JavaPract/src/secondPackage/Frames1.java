package secondPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");

		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(3000);

		// find out total no frames
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(allFrames.size());

		// Check in each frame whether element is present or not
		for (int i = 0; i < allFrames.size(); i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]"));
			if (element.isDisplayed()) {
				System.out.println("Watching  login video");
				element.click();
				break;
			}
		}

		Thread.sleep(5000);
		
		}
	}


