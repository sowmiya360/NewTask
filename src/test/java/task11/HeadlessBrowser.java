package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
	    
		ChromeOptions cp = new ChromeOptions();
	    cp.addArguments("--headless");
	    
		wd=new ChromeDriver();
	}
	
	public static void url()
	{
       long starttime = System.currentTimeMillis();
       
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
		
		WebElement search = wd.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]"));
	    search.sendKeys("party wear");
	    search.submit();
	    
	   long endtime = System.currentTimeMillis();
	   
	   System.out.println(endtime-starttime);
	}
	
	public static void close()
	{
		wd.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*setup();
		url();
        search();		
	*/
	}

}
