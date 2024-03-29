package org.tgp4Task2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	//Task
	public static String[][] readExcel(String sName) throws IOException {

		//locating the excelsheet
		XSSFWorkbook wb = new XSSFWorkbook("./Data_tgp4_task2/Lead.xlsx");

		//fetching the worksheet from work book
		XSSFSheet ws = wb.getSheet(sName);
		
		//getting the total rows
		int lRow = ws.getLastRowNum();
		
		//getting the total cells
		short lCell = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[lRow][lCell];
		//iterating rows
		for (int i = 1; i <=lRow; i++) {
			XSSFRow row = ws.getRow(i);
		
			//iterating cells
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
