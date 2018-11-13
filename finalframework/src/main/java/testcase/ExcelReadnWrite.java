package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelReadnWrite {
	
@Test
public void WriteExcel () throws IOException


{//int count = 1 ;
	FileInputStream fis = new FileInputStream("D:\\Book1.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh = wb.getSheetAt(0);
	Row rowzero = sh.getRow(0);
	int rowcount = sh.getLastRowNum();
	System.out.println(rowcount);
	int colcount = rowzero.getLastCellNum();
	System.out.println(colcount);
	
	for (int x = 0 ; x <=rowcount ; x ++)
	{
		Row row = sh.getRow(x);
		System.out.print("Values of Row " + (x+1) + " are ");
		for (int y = 0 ; y<colcount ; y ++)
		{
		Cell cell = row.getCell(y);
		String Value = cell.getStringCellValue();
		System.out.print(" " + Value);
		}
	System.out.println();	
	}
	
	
	
	
    Row writerow = sh.createRow(rowcount+1);
	for(int i = 0 ; i < 3 ; i ++ )
	{
		Cell writecell = writerow.createCell(i);
		String Ar[]= {"Tajeshwar", "placed9lpa", "HCL" };
		for(int j=i;j<=i;j++)
		{
		writecell.setCellValue(Ar[j]);
		}
	}
	FileOutputStream fos = new FileOutputStream("D:\\Book1.xlsx");
	wb.write(fos);
 System.out.println("sdsa");
	
}

}
