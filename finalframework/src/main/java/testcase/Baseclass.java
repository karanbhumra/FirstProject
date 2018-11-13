package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

public static WebDriver driver;	

public WebDriver browerSelection(String browsername)
{
	if (browsername.equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver","E:/geko/chromedriver.exe");
		driver = new ChromeDriver();
		
			}
	
	else if (browsername.equalsIgnoreCase("firefox"))
	{
System.setProperty("webdriver.gecko.driver","E:/geko/geckodriver.exe");
driver = new FirefoxDriver();

	}
	
	else{
		System.out.println("Incomplatible browser");
	}
	return driver;
 	
	
	
}
	
	
}
