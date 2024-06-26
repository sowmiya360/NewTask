package task7;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestReportTestNG {

	@BeforeTest
	public void m1()
	{
		TestReport.setup();
	}
	@BeforeMethod
	public void m2()
	{
		TestReport.url();
	}
	@Test
	public void m3()
	{
		TestReport.formfill("sowmiya", "subramani", "987522222", "india", "chennai", "kjnhiusdjfj");
	}
	@AfterTest
	public void m4()
	{
		TestReport.close();
	}
	
	
	
}
