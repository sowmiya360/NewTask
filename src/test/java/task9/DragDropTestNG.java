package task9;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDropTestNG {

	@BeforeTest
	public void m1()
	{
		DragDrop.Setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		DragDrop.url();
	}
	
	@Test
	public void m3()
	{
		DragDrop.draganddrop();
	}
	
	@AfterTest
	public void m4()
	{
		DragDrop.close();
	}
}
