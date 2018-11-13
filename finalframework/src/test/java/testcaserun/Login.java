package testcaserun;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testcase.Baseclass;
import testcase.Exceldataextraction;

public class Login extends Baseclass{
	
	

@Test (dataProvider = "testdata", dataProviderClass = testcase.ExcelUtility.class)
public void Log(String browser, String URL , String username , String Passoword) throws IOException, InterruptedException
{ 

for ( int i = 0 ; i < 2 ; i ++ )

{
	browerSelection(browser);
	driver.get(URL);
	Thread.sleep(2000);
	driver.close();
		
}
}
}


