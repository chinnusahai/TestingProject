package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alldatatype {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\WorkSpace\\inmakes\\maven\\MavenProject\\EXCEL\\Book1.XLSX");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet S = wb.getSheet("datas");	
		
		for (int i = 0; i < S.getPhysicalNumberOfRows(); i++) {
			Row r = S.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
					int celltype = c.getCellType();
									//celltype = 1 --> string cell by default
									//celltype !=1 --> date or numeric cell
					if (celltype==1) {
						String value = c.getStringCellValue();
						System.out.println(value );
				}else if(DateUtil.isCellDateFormatted(c))
				{
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yy");
					String format = s.format(dateCellValue);
					System.out.println(format);
				} else {
					double numericCellValue = c.getNumericCellValue();
					long l = (long)numericCellValue;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
			}
		}

	}

}
