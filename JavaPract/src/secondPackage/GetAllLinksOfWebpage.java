package secondPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class GetAllLinksOfWebpage {

	static int linknotDisplayed = 0, linksDisplayed = 0;

	public static void main(String[] args) {
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "C:\\Users\\91774\\Logs\\edgelogs.log");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91774\\eclipse-workspace\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		// allLinksPrint(driver);
		// specificAreaLinks(driver);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		getTitleOfSpecificLink(driver,allLinks);

	}

	public static void allLinksPrint(WebDriver driver) {
		// get all links
		// List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());

		// printing each link if it is displayed
		for (int i = 0; i < allLinks.size(); i++) {
			WebElement linkElement = allLinks.get(i);
			if (linkElement.isDisplayed()) {
				System.out.println(linkElement.getText());
				System.out.println(linkElement.getLocation().x + "," + linkElement.getLocation().y + ")");
				linksDisplayed++;
			} else {
				linknotDisplayed++;
			}

		}
		System.out.println(" Total Displayed links are " + linksDisplayed);
		System.out.println(" Total unDisplayed links are " + linknotDisplayed);
	}

	public static void specificAreaLinks(WebDriver driver) {
		// Printing spefic area links
		WebElement specArea = driver.findElement(By.xpath("//div[@id='red_container_main']//div[27]"));
		List<WebElement> specAreaLinks = specArea.findElements(By.tagName("a"));

		System.out.println("All links in specific area " + specAreaLinks.size());

		// used for each loop to extract echa webelement
		for (WebElement onelink : specAreaLinks) {
			if (onelink.isDisplayed()) {
				System.out.println(onelink.getText());
				System.out.println(onelink.getLocation().x + "," + onelink.getLocation().y + ")");
				linksDisplayed++;
			} else {
				linknotDisplayed++;
			}
		}
		System.out.println(" Total Displayed links are " + linksDisplayed);
		System.out.println(" Total unDisplayed links are " + linknotDisplayed);

	}

	public static void getTitleOfSpecificLink(WebDriver driver,List<WebElement> links) {
		// Get title of specific link in specific area
		for (int i = 0; i < links.size(); i++) {
			WebElement specArea = driver.findElement(By.xpath("//div[@id='red_container_main']//div[27]"));
			List<WebElement> specAreaLinks = specArea.findElements(By.tagName("a"));
			WebElement linkElement = specAreaLinks.get(i);
			linkElement.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}
	}

}
