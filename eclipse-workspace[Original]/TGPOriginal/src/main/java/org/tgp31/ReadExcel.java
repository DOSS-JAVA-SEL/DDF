package org.tgp31;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		//set the path for excel work sheet
		XSSFWorkbook wb = new XSSFWorkbook("./Data_tgp4/CreateLead.xlsx");

		//get into the sheet
		XSSFSheet ws = wb.getSheet("sheet1");

		//getlast row number without header
		int lRow = ws.getLastRowNum();
		System.out.println(lRow);

		//getlast cell number without header
		short lCell = ws.getRow(0).getLastCellNum();
		System.out.println(lCell);

		
		for (int i = 1; i <=lRow; i++) {
			XSSFRow row = ws.getRow(i);

			for (int j = 0; j <lCell; j++) {
				XSSFCell cell = row.getCell(j);

				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}

	}
}
