package task1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeTest
	public void m1()
	{
		NavigateInteractSS.setup();
	}
   
	@BeforeMethod
	public void m2()
	{
		NavigateInteractSS.url();
	}
   
	@Test
	public void m3() throws IOException
	{
		NavigateInteractSS.party();
	}
	
	@AfterMethod
	public void m4()
	{
		NavigateInteractSS.close();
	}

}
