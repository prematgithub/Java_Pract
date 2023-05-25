package firstPacakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWrite {
	public static void main(String[] args) throws Exception {
		// set file path
				File src = new File("C:\\Demo\\Book1.xlsx");

				// load the file
				FileInputStream input = new FileInputStream(src);

				// load workbook
				XSSFWorkbook work = new XSSFWorkbook(input);

				// load the sheet
				XSSFSheet sheet = work.getSheet("NumberSheet");

				// Dealing with Rows
				System.out.println(sheet.getSheetName());
		
				System.out.println(sheet.getRow(0).getCell(0).getNumericCellValue());
				
				sheet.getRow(0).getCell(0).setCellValue(1000.11);
				
				int rows= sheet.getPhysicalNumberOfRows();
				int columns=sheet.getRow(0).getLastCellNum();

				// printing cell data
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns; j++) {
						System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue() + "  ");
					}
					System.out.println();
				}
		
	}

}
