package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverMethods1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91774\\eclipse-workspace\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//div[@class='cell topicons']/a[1]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//div[@class='cell topicons']/a[1]")).click();
		//String un = driver.findElement(By.xpath("//div[@class='cell']/p[@class='form-label']")).getText();
		//System.out.println(un);
		String button=driver.findElement(By.xpath("//div[@class='cell']/input[@type='submit']")).getText();
		System.out.println(button);
	}

}
