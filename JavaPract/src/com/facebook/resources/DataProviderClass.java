package com.facebook.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider
	public static Object[][] readExcelFile() throws Exception {
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
		Object[][] loginTestData = new Object[sheet.getLastRowNum()][columns];
		for (int i = 1; i < rows; i++) {
			//System.out.println(i);
			for (int j = 0; j < columns; j++) {
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue() + " Hi");
				loginTestData[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				// i-1 is taken to avoid Array out of bond exception as we are skipping first
				// row data
			}
		}
		return loginTestData;

	}
}
