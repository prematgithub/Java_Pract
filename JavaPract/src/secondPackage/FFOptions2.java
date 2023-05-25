package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FFOptions2 {

	public static void main(String[] args) {
		FirefoxOptions options= new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver =new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ASDFGH");
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/div/input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.id("email")).clear();
		System.out.println("Hello");

	}

}
