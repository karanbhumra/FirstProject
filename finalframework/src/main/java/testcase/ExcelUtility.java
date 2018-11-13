package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

public class ExcelUtility {

@DataProvider
public static Object[][] testdata() throws IOException
{
	Properties prop = new Properties();
FileInputStream fis = new FileInputStream("C:\\finalframework\\src\\main\\java\\testcase\\File.properties");
	prop.load(fis);
	String location = prop.getProperty("location");
	String Sheetname=prop.getProperty("sheetname");
	fis = new FileInputStream(location);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet(Sheetname);
	Row row = sh.getRow(0);
	int rowcount = sh.getPhysicalNumberOfRows()-1;
	int colcount = row.getLastCellNum();
	Object data[][] = new Object[rowcount][colcount];
	for ( int i = 0; i < rowcount ; i ++ )
	{
		row = sh.getRow(i + 1);
		
		for (int j = 0; j < colcount ; j ++ )
		{
			Cell cell = row.getCell(j);
			DataFormatter form = new DataFormatter();
			String value = form.formatCellValue(cell);
			data[i][j]=value;	
		}
	}
	
return data;	
}
}
