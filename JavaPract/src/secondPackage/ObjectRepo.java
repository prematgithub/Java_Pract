package secondPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepo {
	public static void main(String[] args) throws Exception {
		//Setting path of object repository
		File source= new File("C:\\Softwares\\WorkSpace\\JavaPract\\Repository\\Object_repo.properties");
		
		//Create inputStream class Object to load the file
		FileInputStream input = new FileInputStream(source);
		
		//Creating Properties class object to read properties file
		Properties pro =new Properties();
		pro.load(input);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Performing login operation i=using Properties file
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.id(pro.getProperty("email"))).sendKeys(pro.getProperty("TestData1"));
		driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys(pro.getProperty("TestData2"));
		driver.findElement(By.name(pro.getProperty("Login_Button"))).click();
		
		Thread.sleep(5000);
		
		
		
	}

}
