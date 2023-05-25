package secondPackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/cricket/schedule.html");

		List<WebElement> tables = driver.findElements(By.xpath("//table"));
		for (int i = 1; i < tables.size(); i++) {
			
			//get the heading of match
			String header = tables.get(i).findElement(By.xpath("//table[" + i + "]/tbody/tr[1]")).getText();
			
			//Find only India's matches
			if (header.contains("India")) {
				System.out.println(header);
				//find allrows of ith particular table
				List<WebElement> allRows = tables.get(i).findElements(By.xpath("//table[" + i + "]/tbody/tr"));
				for (int j = 2; j < allRows.size(); j++) {
					// System.out.print(allRows.get(j).getText()+" ");
					//find all row values of jth column of ith particular table
					List<WebElement> rowValues = allRows.get(j)
							.findElements(By.xpath("//table[" + i + "]/tbody/tr[" + j + "]/td"));
					for (int k = 0; k < rowValues.size(); k++) {
						System.out.print("  "+rowValues.get(k).getText()+"	");
					}
					System.out.println();
				}

				System.out.println();
			}
			
		}

		driver.quit();
	}

}
/*
 * List<WebElement> headers =
 * driver.findElements(By.xpath("//table/tbody/tr[1]")); List<WebElement>
 * clHeaders = driver.findElements(By.xpath("//table[1]/tbody/tr[2]/td")); //
 * Get the India's schedule tables only //
 * System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]")).
 * getText()); for (int i = 0; i < headers.size(); i++) { if
 * (headers.get(i).getText().contains("India")) {
 * System.out.println(headers.get(i).getText()); //
 * System.out.println(headers.get(i).findElements(By.xpath(
 * "//table/tbody/tr[2]/td")).get(i).getText());
 * 
 * // Getting all columns title
 * 
 * for (int j = 0; j < clHeaders.size(); j++) {
 * System.out.print(clHeaders.get(j).getText() + "	"); } System.out.println();
 * System.out.println(); } }
 */
