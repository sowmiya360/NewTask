package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class elementpresent {
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
	    wd = new ChromeDriver();
	}
	
	public static void url()
	{
		wd.get("https://candymapper.com/");
		wd.manage().window().maximize();
		WebElement pop=wd.findElement(By.id("popup-widget238491-cta"));
		  pop.click();
	}
	public static void header()
	{
		WebElement head=wd.findElement(By.xpath("//div[contains(@id,'navBarId-238379')]"));
	    Assert.assertTrue(head.isDisplayed());
	}
	
	public static void image()
	{
		WebElement img =wd.findElement(By.xpath("//img[contains(@data-aid,'BACKGROUND_IMAGE_RENDERED')]"));
		Assert.assertTrue(img.isDisplayed());
	}
	public static void button()
	{
		WebElement linked=wd.findElement(By.xpath("//a[contains(@data-aid,'SOCIAL_LINKEDIN_LINK')]"));
	  /*type1 */ 
		Assert.assertTrue(true, linked.getText());
	    
	  /*type 2 */
	  if(linked.getText() != null)
	    {
	    	System.out.println("element is present");
	    }
	    else
	    {
	    	System.out.println("eleemnt is not present");
	    }
	}
	   public static void close()
	   {
		   wd.quit();
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*setup();
		url();
		header();
		image();
		button();
	*/
	}

}
