package task2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormHandlingTestNG {

	@BeforeTest
	public void m1()
	{
		FormHandling.setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		FormHandling.url();
	}
  
	@Test
	public void m3()
	{
		FormHandling.createaccount();
		FormHandling.urlcheck();
	}		
	
	@AfterMethod
	public void m5()
	{
		FormHandling.close();
	}
	
}
