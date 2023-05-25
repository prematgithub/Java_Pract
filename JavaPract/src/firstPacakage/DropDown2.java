package firstPacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);

		// 1st way not recommended but widely used indusrty
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total months options " + months.size());
		System.out.println(months.get(5).isEnabled());
		months.get(5).click();

		// 2nd way using Select class- recommended
		WebElement yr = driver.findElement(By.xpath("//select[@id='yea']"));
		Select byr = new Select(yr);
		byr.selectByIndex(2);
		byr.selectByValue("1995");
		Thread.sleep(3000);
		byr.selectByVisibleText("1999");
		System.out.println("Latest option selected is87827 " + byr.getFirstSelectedOption().getText());

		// 3rd way
		List<WebElement> yearList = byr.getOptions();
		System.out.println("Total year options " + yearList.size());
		for (int i = 0; i < yearList.size(); i++) {
			if (yearList.get(i).getText().equalsIgnoreCase("1995")) {
				yearList.get(i).click();
				break;

			}
		}
		System.out.println("Latest option selected is456 " + byr.getFirstSelectedOption().getText());
		System.out.println(byr.isMultiple());

		// 4th way
		yr.sendKeys("2000");
		System.out.println("Latest option selected is122 " + byr.getFirstSelectedOption().getText());

		// 5th way
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");

		Thread.sleep(3000);

		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select sDate = new Select(date);
		List<WebElement> SdateList=sDate.getOptions();
		System.out.println(SdateList.size());
		for (int i = 0; i < SdateList.size(); i++) {
			if (SdateList.get(i).getText().equals("21")) {
				sDate.selectByIndex(i);
				break;
			}

		}
		System.out.println("Date of birth select is " + sDate.getFirstSelectedOption().getText());
		System.out.println("sdfghjk");

	}

}