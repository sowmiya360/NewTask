package task2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class FormHandling {
	
    public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
		wd=new ChromeDriver();
	}

	public static void url()
	{
	  wd.get("https://candymapper.com/");
	  wd.manage().window().maximize();
	  WebElement pop=wd.findElement(By.id("popup-widget238491-cta"));
	  pop.click();
	}
	
	 public static void createaccount()
	 {
		 wd.findElement(By.id("n-238369238407-membership-icon")).click();
		WebElement createacc=wd.findElement(By.xpath("//a[contains(@id,'n-238369238407-membership-create-account')]"));
		createacc.click();
	    
		WebElement firstname=wd.findElement(By.xpath("//input[contains(@placeholder,'First name')]"));
	    WebElement lastname=wd.findElement(By.xpath("//input[contains(@placeholder,'Last name')]"));
        WebElement email=wd.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
	    firstname.sendKeys("sowmiya");
	    lastname.sendKeys("subramani");
	    email.sendKeys("sowmiyamani2097@gmail.com");
	    
	    WebElement button=wd.findElement(By.xpath("//button[contains(@class,'x-el x-el-button c2-g c2-h c2-36 c2-m c2-42 c2-43 c2-15 c2-44 c2-1t c2-i c2-k c2-j c2-1b c2-1k c2-27 c2-45 c2-46 c2-47 c2-48 c2-49 c2-4a c2-4b c2-4c c2-4d c2-3 c2-4e c2-4f c2-w c2-4g c2-4h c2-4i c2-4j c2-4k c2-4l c2-4m c2-4n c2-4o c2-4p c2-4q c2-4r c2-4s c2-4t c2-4u c2-4v c2-4w c2-4x c2-4y c2-4z c2-50 c2-51 c2-10 c2-11 c2-12 c2-13')]"));
	    button.click();
	 }
	 
	  public static void urlcheck()
	  {
		  String ExpectedURL = "https://candymapper.com/m/create-account";
		  if(wd.getCurrentUrl().equals(ExpectedURL))
		  {
			  System.out.println("sucessfully submitted");
		  }
		  else
		  {
			  System.out.println("not submitted");
		  }
	  }

	/*  public static void check()
	  {
		  String ExpectedURL = "https://candymapper.com/m/create-account";
		  Assert.assertEquals(wd.getCurrentUrl(), ExpectedURL);
	  }*/
	public static void close()
	 {
		 wd.quit();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /* setup();
		url();
		createaccount();
		//check();
	    urlcheck();
	*/
	}
	

}
