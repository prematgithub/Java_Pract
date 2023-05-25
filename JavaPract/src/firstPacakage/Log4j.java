package firstPacakage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) throws Exception {
		// create Logger instance by passing class name for which we want create logs
		Logger logger = null;
		logger = Logger.getLogger("Log4j");

		// configure log4j file path
		PropertyConfigurator.configure("C:\\Users\\91774\\eclipse-workspace\\JavaPract\\log4j.properties");

		//
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Opened chrome Browser");

		driver.manage().window().maximize();
		logger.info("Browser is maximized");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implemented Implicit Wait");

		driver.get("https://www.facebook.com/");
		logger.info("apllication launched");

		Thread.sleep(3000);
		driver.close();
	}

}
