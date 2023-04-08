package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alldata {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\WorkSpace\\inmakes\\maven\\MavenProject\\EXCEL\\Book1.XLSX");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet S = wb.getSheet("DATA");	
		
		for (int i = 0; i < S.getPhysicalNumberOfRows(); i++) {
			Row r = S.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
						System.out.println(c);
				}
		}
		

	}

}
