package task9;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hoverTestNG {

	@BeforeTest
	public void m1()
	{
		hover.Setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		hover.url();
	}
	
	@Test
	public void m3()
	{
		hover.hove();
	}
	
	@AfterTest
	public void m4()
	{
		hover.close();
	}
}
