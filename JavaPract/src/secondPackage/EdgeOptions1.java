package secondPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeOptions1 {

	public static void main(String[] args) {
		// log file
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "C:\\Users\\91774\\Logs\\edgelogs.log");
		//edge option
		EdgeOptions options=new EdgeOptions();
		options.setPageLoadStrategy("eager");
		options.setPageLoadStrategy("none");
		options.setPageLoadStrategy("normal");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91774\\eclipse-workspace\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

}
