package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class Exceldataextraction {
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static DataFormatter formatter = new DataFormatter();
	
	public String sheetPath(String sheetpath)
	
	{
		return sheetpath;
	}
	
	public String sheetName(String sheetname)
	{
		return sheetname;
	}
	
@DataProvider
public static Object[][] testdata() throws IOException
{
	Properties prop = new Properties();
	
	FileInputStream fis = new FileInputStream("C:\\finalframework\\src\\main\\java\\testcase\\File.properties");
	prop.load(fis);
	String location=prop.getProperty("location");
	String sheetname=prop.getProperty("sheetname");	
	fis = new FileInputStream(location);
	wb = new XSSFWorkbook(fis);
    sh = wb.getSheet(sheetname);

	Row row = sh.getRow(0);
	int Rowcount = sh.getPhysicalNumberOfRows() - 1;
	int colcount = row.getLastCellNum();
	Object Data[][] = new Object[Rowcount][colcount] ;
    for (int i = 0 ; i < Rowcount ; i ++ )
      {
	   row = sh.getRow(i+1);
	   
	   for ( int j =0 ; j < colcount ; j ++)
		   
	   {
		   Cell cell = row.getCell(j);
		   String value = formatter.formatCellValue(cell);
		   Data[i][j]=value;
		   
	   }

	
      }
	return Data;
   	
}	
}

	


