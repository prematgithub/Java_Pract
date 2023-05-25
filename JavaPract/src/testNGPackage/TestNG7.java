package testNGPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG7 {

	WebDriver driver;
	Properties pro;

	@BeforeClass
	public void setEnv() throws Exception {
		// load properties file
		File src = new File("C:\\Softwares\\WorkSpace\\JavaPract\\Repository\\Object_repo.properties");
		FileInputStream input = new FileInputStream(src);
		pro = new Properties();
		pro.load(input);

		// launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));
	}

	// Get current date and time
	public String getDateAndTime() {
		DateTimeFormatter currentDateAndTime = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return currentDateAndTime.format(now);

	}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] data = new Object[3][2];
		TestNG7 t7 = new TestNG7();
		data[0][0] = pro.getProperty("TestData1") + " " + t7.getDateAndTime();
		data[0][1] = pro.getProperty("TestData2");

		data[1][0] = "Prem123";
		data[1][1] = "124563";

		data[2][0] = "Pune@gmail";
		data[2][1] = "Heloo12345";

		return data;

	}

	// Using Excel file
	@DataProvider
	public Object excelData() throws Exception {
		// set file path
		File src = new File("C:\\Demo\\BookRead.xlsx");
		// load the file
		FileInputStream input = new FileInputStream(src);
		// load workbook
		XSSFWorkbook work = new XSSFWorkbook(input);
		// load the sheet
		XSSFSheet sheet = work.getSheet("DemoSheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] loginTestData= new Object[sheet.getLastRowNum()][columns];
		for (int i = 1; i < rows; i++) {
			System.out.println(i);
			for (int j = 0; j < columns; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+" Hi");
				loginTestData[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				//i-1 is taken to avoid Array out of bond exception as we are skipping first row data
			}
		}
		return loginTestData;

	}

	@Test(dataProvider = "readExcelFile")
	public void login(String username1, String passaword1) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id(pro.getProperty("email"))).clear();
		driver.findElement(By.xpath(pro.getProperty("password"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.id(pro.getProperty("email"))).sendKeys(username1);
		driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys(passaword1);
		Thread.sleep(3000);
		driver.findElement(By.name(pro.getProperty("Login_Button"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
