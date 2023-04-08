package org.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExceldataDrivenAllDatas {

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
		int noR = s.getPhysicalNumberOfRows();
			//System.out.println(noR);
		for (int i = 0; i< noR; i++) {
			
			Row row = s.getRow(i);
			int noC = row.getPhysicalNumberOfCells();
			//System.out.println(noC);
			
			for (int j = 0; i< noC; j++) {
				
				Cell cell = row.getCell(j);
			//	System.out.println(cell);
			}
		}	
	}
}
