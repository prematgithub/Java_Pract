package firstPacakage;

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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");

		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(3000);

		// find out total no frames
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(allFrames.size());

		// Check in each frame whethet element is present or not
		for (int i = 0; i < allFrames.size(); i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]"));
			if (element.isDisplayed()) {
				System.out.println("We have found WebElement");
				element.click();
				break;
			}
		}

		// Handling Nested frames
		driver.navigate().to("https://demoqa.com/nestedframes");
		Thread.sleep(3000);
		List<WebElement> nestFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(nestFrames.size());
		for (int i = 0; i < nestFrames.size(); i++) {
			driver.navigate().refresh();// If we don't refresh page then control will stuck at first frame and will
										// throw NOsuchFramefound exception
			Thread.sleep(3000);
			driver.switchTo().frame(i);
			Thread.sleep(3000);
//			System.out.println("Switched to frame no. "+i);

			List<WebElement> inFrames = driver.findElements(By.tagName("iframe"));
			System.out.println("No of inner frames in " + i + " are " + inFrames.size());
			if (inFrames.size() > 0) {
				driver.switchTo().frame(0);
				Thread.sleep(3000);
				String text = driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
				System.out.println("We have Inner frame as " + text);
				break;
			}

		}
	}

}
