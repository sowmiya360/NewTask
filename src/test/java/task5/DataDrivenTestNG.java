package task5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataDrivenTestNG extends DataDriven {

	@BeforeTest
	public void m1()
	{
		DataDriven.setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		DataDriven.url();
	}
	
	@Test(dataProvider="testdata")
	
		public static void login(String emailid,String password)
		{
			WebElement button=wd.findElement(By.xpath("//a[contains(@class,'right_side_item login btn_general')]"));
		    button.click();
		    WebElement email=wd.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
		    email.sendKeys(emailid);
		    WebElement pass=wd.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		    pass.sendKeys(password);
		    WebElement login=wd.findElement(By.xpath("//button[contains(@type,'submit')]"));
		    login.click();
		    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    login.click();
		}
	
	@DataProvider(name="testdata")

	public Object[] [] testdata()
	{
		Object [] [] data = new Object [2] [2];
		data [0] [0] = "sowmiya@gmail.com";
		data [0] [1] = "nbsdhj";
		data [1] [0] = "sowmiyamani2097@gmail.com";
		data [1] [1] = "Ganeshsowmiya@1";
		
		return data;
		
	}
	
	@AfterTest
	public void m4()
	{
		DataDriven.close();
	}
	
}
