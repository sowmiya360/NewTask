package task3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class elementpresentTestNG {

	
	@BeforeTest
	public void m1()
	{
		elementpresent.setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		elementpresent.url();
	}
	
	@Test
	public void m3()
	{
		elementpresent.header();
		elementpresent.image();
		elementpresent.button();	
	}

	@AfterMethod
	public void m4()
	{
		elementpresent.close();
	}
	
	
}
