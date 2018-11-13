package testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGpol {


	@Test
	
	public void softassert()
	{
		SoftAssert soft = new SoftAssert();
		System.out.println("dfsdfs");
		soft.assertTrue(false,"fail");
        System.out.println("dsfsd");   
		
		
	}
	
	
	
	
		// TODO Auto-generated method stub

	}


