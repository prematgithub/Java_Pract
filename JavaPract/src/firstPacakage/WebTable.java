package firstPacakage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");

		// Headers of all column
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("Total no. of columns in table are " + headers.size());

		// List of all companies name
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("All companies " + allCompanies.size());

		// List of current price
		List<WebElement> allCurrentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(allCurrentPrices.size());

		String expected = "Suraj";
		for (int i = 0; i < allCompanies.size(); i++) {
			if (allCompanies.get(i).getText().equalsIgnoreCase(expected)) {
				System.out.println(
						allCompanies.get(i).getText() + " have current price " + allCurrentPrices.get(i).getText());
				allCompanies.get(i).click();
				break;
			}
		}

	}
}