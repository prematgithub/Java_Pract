package firstPacakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFileRead {
	public static void main(String[] args) throws Exception {

		// set file path
		File src = new File("C:\\Demo\\Book1.xlsx");

		// load the file
		FileInputStream input = new FileInputStream(src);

		// load workbook
		XSSFWorkbook work = new XSSFWorkbook(input);

		// load the sheet
		XSSFSheet sheet = work.getSheet("DemoSheet1");

		// Dealing with Rows
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue()); // username
		System.out.println(sheet.getRow(4).getCell(1).getStringCellValue()); // pass4
		
		
		//Setting value in cell
		sheet.getRow(1).getCell(0).setCellValue("Hello");
		// no of rows
		System.out.println("Total no of Rows " + sheet.getPhysicalNumberOfRows());

		System.out.println("Total no of Rows " + (sheet.getLastRowNum() + 1));// it will return index of last row

		int rows = (sheet.getLastRowNum() - sheet.getFirstRowNum()) + 1;
		System.out.println("Total no of Rows " + rows);

		// dealing with columns
		System.out.println("Total no of columns " + sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("Total no of columns " + sheet.getRow(2).getLastCellNum());

		int columns = sheet.getRow(0).getLastCellNum();

		// printing cell data
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "  ");
			}
			System.out.println();
		}
		

		// entering data to text fields
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));

		email.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		password.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		login.click();
		
		// Checking login functionality using all usernames and passwords
				for (int i = 0; i < rows; i++) {
					Thread.sleep(10000);
					email.clear();
					password.clear();
					email.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
					password.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
					login.click();
					Thread.sleep(10000);
					driver.navigate().back();
				}

	}

}
