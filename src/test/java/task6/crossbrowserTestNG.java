package task6;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class crossbrowserTestNG {
	
	@Test
	public void m1()
	{
		crossbrowser.browsersetup("edge");
	
	}
	
	@Test(dependsOnMethods= {"m1"})
	public void m2()
	{
		crossbrowser.url();
		crossbrowser.popup();
	}
	
	@AfterTest
	public void m3()
	{
		crossbrowser.close();
	}

}
