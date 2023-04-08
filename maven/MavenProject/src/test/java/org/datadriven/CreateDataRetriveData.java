package org.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateDataRetriveData {


	public static void main(String[] args) throws IOException {
		File f = new File("D:\\WorkSpace\\inmakes\\maven\\MavenProject\\EXCEL\\Book1.XLSX");
		Workbook wb = new XSSFWorkbook();
		Sheet S = wb.createSheet("new");	
		
		String[] data1 = {"selenium","java","data driven","pom"};
		String[] data2 = {"appium","cucumber","junit","testNG"};
		
		for (int i = 0; i < 2; i++) {
			Row row = S.createRow(i);
			if (i==0) {
				for (int j = 0; j < 4; j++) {
					Cell cell = row.createCell(j);
					cell.setCellValue(data1[j]);
					System.out.println(cell.getStringCellValue());
				}
			}else {
				for (int j = 0; j < 4; j++) {
					Cell cell = row.createCell(j);
					cell.setCellValue(data2[j]);
					System.out.println(cell.getStringCellValue());
				}
			}		
		}FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);	
		
	}
		
}
