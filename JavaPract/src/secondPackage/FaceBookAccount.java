package secondPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccount {

	public static void main(String[] args) throws Exception {

		
		// Setting properties file path and loading file
		File src = new File("C:\\Softwares\\WorkSpace\\JavaPract\\Repository\\Object_repo.properties");
		FileInputStream input = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(input);

		// Setting chrome properties and creating driver
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		// Loading page and creating new account
		driver.get(pro.getProperty("URL"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Create_New_Account"))).click();
		driver.findElement(By.xpath(pro.getProperty("First_Name"))).sendKeys(pro.getProperty("First_Name_Data"));
		driver.findElement(By.xpath(pro.getProperty("Surname"))).sendKeys(pro.getProperty("Surname_data"));
		driver.findElement(By.xpath(pro.getProperty("Mobile_Or_emailId"))).sendKeys(pro.getProperty("TestData1"));
		driver.findElement(By.xpath(pro.getProperty("reEnter_email"))).sendKeys(pro.getProperty("TestData1"));
		driver.findElement(By.xpath(pro.getProperty("New_password"))).sendKeys(pro.getProperty("TestData2"));

		// selecting date of birth date using dropdown
		WebElement day = driver.findElement(By.xpath(pro.getProperty("Day_Of_Birth")));
		Select sday = new Select(day);
		sday.selectByValue(pro.getProperty("Day_Of_Birth_Data"));

		WebElement month = driver.findElement(By.xpath(pro.getProperty("Month_Of_Birth")));
		Select smonth = new Select(month);
		smonth.selectByIndex(5);

		WebElement year = driver.findElement(By.xpath(pro.getProperty("Year_Of_Birth")));
		Select syear = new Select(year);
		List<WebElement> allYears = syear.getOptions();
		for (int i = 0; i < allYears.size(); i++) {
			if (allYears.get(i).getText().equalsIgnoreCase(pro.getProperty("Year_Of_Birth_Data"))) {
				allYears.get(i).click();
				break;
			}
		}
		
		//Select gender Radio button
		List<WebElement> selectGender=driver.findElements(By.xpath(pro.getProperty("Gender_Radio")));
		for(int i=0;i<selectGender.size();i++) {
			if(selectGender.get(i).getText().equalsIgnoreCase(pro.getProperty("Gender"))) {
				selectGender.get(i).click();
			}
		}
		
		//clicking sign up button
		driver.findElement(By.xpath(pro.getProperty("Sign_Up"))).click();
		
		System.out.println(driver.findElement(By.xpath(pro.getProperty("Error_At_SignUp"))).getText());
		
		
		
		
	}

}
