package secondPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption2 {

	public static void main(String[] args) throws Exception {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.id("email")).sendKeys("77419577");
		driver1.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/div/input[@id='pass']")).sendKeys("prem");
		Thread.sleep(4000);
		driver1.findElement(By.xpath("//div[@class='_6ltg']/button")).click();
	}

}
