package secondPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers {

	public static void main(String[] args) {
		//Setting chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		//System.setProperty("ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY", "C:\\Users\\91774\\eclipse-workspace\\");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.naukri.com/mnjuser/homepage");
		
		//setting Firefox driver path
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		FirefoxDriver driver2 =new FirefoxDriver();
		driver2.get("https://www.naukri.com/mnjuser/homepage");
		
		//setting path for Edge
		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver3=new EdgeDriver();
		driver3.get("https://www.naukri.com/mnjuser/homepage");
		
		
		
	}

}
