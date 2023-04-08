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
import org.base.BaseClass;

public class createExcel extends BaseClass {

	public static void main(String[] args) throws IOException {
		createExcel C = new createExcel();
		
		String s = "D:\\WorkSpace\\inmakes\\maven\\MavenProject\\EXCEL\\B1.xlsx";
		
		C.createSheet(s,0, 0, "java");
		C.createCell(s,0, 1, "dataDriven");
		C.createCell(s,0, 2, "cucumber");
		
		C.createRow(s,1, 0, "junit");
		C.createCell(s,1, 1, "jerking");
		C.createCell(s,1, 2, "git");
	}

}


//private static void createSheet(String s, int r, int c, String writeData ) throws IOException {
//File f = new File(s);
//Workbook wb = new XSSFWorkbook();
//Sheet S = wb.createSheet("new");	
//Row row = S.createRow(r);
//Cell cell = row.createCell(c);
//cell.setCellValue(writeData);	
//FileOutputStream fos = new FileOutputStream(f);
//wb.write(fos);
//}
//private static void createCell(String s, int r, int c, String writeData ) throws IOException {
//File f = new File(s);
//FileInputStream fis = new FileInputStream(f);
//Workbook wb = new XSSFWorkbook(fis);
//Sheet S = wb.getSheet("new");	
//Row row = S.getRow(r);
//Cell cell = row.createCell(c);
//cell.setCellValue(writeData);	
//FileOutputStream fos = new FileOutputStream(f);
//wb.write(fos);
//}
//private static void createRow(String s,	int r, int c, String writeData ) throws IOException {
//File f = new File(s);
//FileInputStream fis = new FileInputStream(f);
//Workbook wb = new XSSFWorkbook(fis);
//Sheet S = wb.getSheet("new");	
//Row row = S.createRow(r);
//Cell cell = row.createCell(c);
//cell.setCellValue(writeData);	
//FileOutputStream fos = new FileOutputStream(f);
//wb.write(fos);
//}