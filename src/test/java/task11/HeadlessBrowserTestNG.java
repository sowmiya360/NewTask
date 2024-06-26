package task11;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadlessBrowserTestNG {

	@BeforeTest
	public void m1()
	{
		HeadlessBrowser.setup();
	}
	
	@Test
	public void m2()
	{
		HeadlessBrowser.url();
	}
	
	@AfterTest
	public void m3()
	{
		HeadlessBrowser.close();
	}
	
	
}
