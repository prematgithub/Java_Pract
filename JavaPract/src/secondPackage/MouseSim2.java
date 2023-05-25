package secondPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSim2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//switching to frame coz frame
		
		List<WebElement> allFrames= driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames on web page are "+allFrames.size());
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		//find draggable element
		WebElement dragable= driver.findElement(By.id("draggable"));
		
		//find dropable element
		WebElement dropable= driver.findElement(By.id("droppable"));
		
		//dragAndDrop by using ations class
		Actions act= new Actions(driver);
		act.dragAndDrop(dragable, dropable).build().perform();
		
		
		
		
	}

}
