package org.leads;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public static String[][] readExcel(String sheet) throws IOException {

		//locating the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/Leads.xlsx");

		//fetching the worksheet
		XSSFSheet ws = wb.getSheet(sheet);

	
		//fetching the lRows count
		int lRow = ws.getLastRowNum();
		System.out.println(lRow);

		//fetching the lCell count
		short lCell = ws.getRow(0).getLastCellNum();
		System.out.println(lCell);

		//2d Array 
		String[][] data = new String[lRow][lCell];
		//iteration of rows
		for (int i = 1; i <=lRow; i++) {
			XSSFRow row = ws.getRow(i);

			//iteration of cells
			for (int j = 0; j <lCell; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j] = cellValue;
			}
		}
		wb.close();
		return data;
	}

}
