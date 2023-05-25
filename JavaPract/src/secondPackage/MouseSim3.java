package secondPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSim3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		List<WebElement> allFrames= driver.findElements(By.tagName("iframe"));
		System.out.println(allFrames.size());
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act= new Actions(driver);
		//dragAndDropBy by x and y points
		//act.dragAndDropBy(source, 170, 200).build().perform();
		Thread.sleep(3000);
		
		act.clickAndHold(source).dragAndDropBy(source, 100, 100).build().perform();
		
		driver.quit();

	}

}
