package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataDriven {

	public static void main(String[] args) throws IOException {
		
		// to mention excel path
		File f = new File("D:\\WorkSpace\\inmakes\\maven\\MavenProject\\EXCEL\\Book1.XLSX");
		//to read the file
		FileInputStream fis = new FileInputStream(f);
		//to read .xlsx
		//XSSFWorkbook wb = new XSSFWorkbook(fis);
		Workbook wb = new XSSFWorkbook(fis);
		// get sheet from workbook
		Sheet s = wb.getSheet("DATA");
		// get row from sheet
		Row r = s.getRow(0);
		//to get a row
		Cell c = r.getCell(1);
		System.out.println(c);
		
		
	}

}
