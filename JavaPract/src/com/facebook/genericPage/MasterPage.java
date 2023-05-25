package com.facebook.genericPage;

import java.io.FileInputStream;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class MasterPage {
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties logs;
	public Logger logger;

	// Constructor of MasterPage
	public MasterPage() throws Exception {
		// create Logger instance by passing class name for which we want create logs
		logger = Logger.getLogger("Log4j");

		// PropertyConfigurator.configure(System.getProperty("user.dir") +
		// "\\log4j.properties");

		// Configuration property file user.dir shows current project directory
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);
		logger.info("configuration.properties file loaded");

		// locators properties file
		FileInputStream iploc = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(iploc);

		DesiredCapabilities cap = null;
		// Choose browser
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			 "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
			 driver = new ChromeDriver();
			System.out.println("Using chrome browser ");
			
			//Using Selenium grid
			/*cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);*/

		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// System.getProperty("user.dir") +
			// "\\com\\facebook\\drivers\\geckodriver.exe");
			// driver = new FirefoxDriver();
			
			//Using Selenium grid
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			// System.setProperty("webdriver.edge.driver",
			// System.getProperty("user.dir") +
			// "\\com\\facebook\\drivers\\msedgedriver.exe");
			// driver = new EdgeDriver();
			
			//Using Selenium grid
			cap = DesiredCapabilities.edge();
			// we have used EdgeOptions to perform browser specific actions
			EdgeOptions options = new EdgeOptions();
			options.merge(cap);
			// cap.setBrowserName(BrowserName);
			cap.setPlatform(Platform.ANY);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));

	}

}

