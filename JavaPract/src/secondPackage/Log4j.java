package secondPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) throws Exception {
		// create Logger instance by passing class name for which we want create logs

		Logger logger = Logger.getLogger("Log4j");

		// configure log4j file path
		PropertyConfigurator.configure("C:\\Users\\91774\\eclipse-workspace\\JavaPract\\log4j.properties");

		// Setting path of object repository
		File source = new File("C:\\Softwares\\WorkSpace\\JavaPract\\Repository\\Object_repo.properties");
		logger.info("Object repository path is set");

		// Create inputStream class Object to load the file
		FileInputStream input = new FileInputStream(source);

		// Creating Properties class object to read properties file
		Properties pro = new Properties();
		pro.load(input);
		logger.info("Object repository file is loaded");

		//
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Opened chrome Browser");

		driver.manage().window().maximize();
		logger.info("Browser is maximized");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implemented Implicit Wait");

		// Loading page and creating new account
		driver.get(pro.getProperty("URL"));
		logger.info("Facebook apllication launched");
		
		// Performing login operation i=using Properties file
		driver.findElement(By.id(pro.getProperty("email"))).sendKeys(pro.getProperty("TestData1"));
		logger.info("Email Id is entered");
		driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys(pro.getProperty("TestData2"));
		logger.info("Password entered");
		driver.findElement(By.name(pro.getProperty("Login_Button"))).click();
		logger.info("Login button clicked");
		Thread.sleep(3000);
		
	}

}
