package task8;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POMTestNG {

	@BeforeTest
	public void m1()
	{
		POMLogin.Setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		POMLogin.url();
	}
	
	@Test
	public void m3()
	{
		POMLogin.login("sowmiyamani2097@gmail.com", "Ganeshsowmiya@1");
	}
	
	@AfterTest
	public void m4()
	{
		POMLogin.close();
	}
	
}
