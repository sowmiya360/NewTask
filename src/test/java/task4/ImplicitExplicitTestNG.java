package task4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitExplicitTestNG {

	@BeforeTest
	public void m1()
	{
		ImplicitExplicit.setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		ImplicitExplicit.url();
	}
	
	@Test
	public void m3()
	{
		ImplicitExplicit.more();
	}


}
