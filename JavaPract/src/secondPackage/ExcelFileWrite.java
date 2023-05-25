package secondPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWrite {
	public static void main(String[] args) throws Exception {

		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("WriteExcel");

		Integer[][] numbers = { { 11, 22 }, { 10, 20 }, { 1, 45 } };

		int rowCount = 0;
		for (Integer[] num : numbers) {
			Row row = sheet.createRow(++rowCount);
			//System.out.println(num);
			int columnCount = 0;
			for(Integer digit:num) {
				//System.out.println(digit);
				Cell cell= row.createCell(++columnCount);
				cell.setCellValue(digit);
			}

		}
		File src = new File("C:\\Demo\\Book1.xlsx");
		FileOutputStream outFile= new FileOutputStream(src);
		workBook.write(outFile);
		System.out.println("Excel file is written");

	}
}
