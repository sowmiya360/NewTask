package task4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {
	
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
	    wd = new ChromeDriver();
	}
	
	public static void url()
	{
		wd.get("https://candymapper.com/");
		//wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		wd.manage().window().maximize();
		
		WebElement pop=wd.findElement(By.id("popup-widget238491-cta"));
		pop.click();
	}
	
	public static void more()
	{
		WebElement linkedin=wd.findElement(By.xpath("//a[contains(@data-aid,'SOCIAL_LINKEDIN_LINK')]"));
	
	    WebDriverWait ww =new WebDriverWait(wd,Duration.ofSeconds(8));
	    ww.until(ExpectedConditions.visibilityOf(linkedin));
	    linkedin.click();
	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // setup();
       //url();
      //more();
	 
	}

}
