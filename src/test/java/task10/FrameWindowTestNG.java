package task10;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameWindowTestNG {

	@BeforeTest
	public void m1()
	{
		FrameWindow.Setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		FrameWindow.url();
	}
	
	@Test
	public void m3()
	{
		FrameWindow.frame();
	}
	
	@Test
	public void m4()
	{
		FrameWindow.window();
	}
	
	@AfterTest
	public void m5()
	{
		FrameWindow.close();
	}
	
	
	
	
}

