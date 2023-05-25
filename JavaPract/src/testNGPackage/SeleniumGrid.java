package testNGPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid {
	// When the @DataProvider method is annotated with parallel = true, TestNG
	// creates multiple instances of the test class and distributes the data
	// provider invocations across those instances.
	@DataProvider(parallel = true)
	public Object[][] sendData() {
		Object array[][] = new Object[2][2];
		array[0][0] = "pune@gmail.com";
		array[0][1] = "edge";
		array[1][0] = "hello@gmail.com";
		array[1][1] = "edge" + "";
		return array;

	}

	@Test(dataProvider = "sendData")
	public void loginTest(String UserName, String BrowserName) throws Exception {
		DesiredCapabilities cap = null;
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.out.println("Using chrome browser ");
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName(BrowserName);
			cap.setPlatform(Platform.WINDOWS);

			RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			driver.get("https://www.facebook.com/login");
			driver.findElement(By.id("email")).sendKeys(UserName);
		} else if (BrowserName.equalsIgnoreCase("edge")) {

			cap = DesiredCapabilities.edge();
			// we have used EdgeOptions to perform browser specific actions
			EdgeOptions options = new EdgeOptions();
			options.merge(cap);
			// cap.setBrowserName(BrowserName);
			cap.setPlatform(Platform.ANY);
			RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

			driver.get("https://www.facebook.com/login");
			driver.findElement(By.id("email")).sendKeys(UserName);
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName(BrowserName);
			cap.setPlatform(Platform.ANY);
			RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			driver.get("https://www.facebook.com/login");
			driver.findElement(By.id("email")).sendKeys(UserName);
		}

	}

}
