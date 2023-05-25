package secondPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadNews {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91774\\eclipse-workspace\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://edition.cnn.com/");
		String news = driver.findElement(By
				.xpath("//*[@id=\"intl_homepage1-zone-1\"]/div[2]/div/div[2]/ul/li[1]/article/div/div[2]/h3/a/span[2]"))
				.getText();
		System.out.println(news);
	}

}
