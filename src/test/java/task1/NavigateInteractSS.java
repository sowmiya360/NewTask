package task1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class NavigateInteractSS {

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
	}
	 public static void party() throws IOException
	 {
		 WebElement popup=wd.findElement(By.xpath("//a[contains(@id,'popup-widget238491-cta')]"));
		 popup.click();
		 WebElement par=wd.findElement(By.xpath("//a[contains(@class,'x-el x-el-a c1-50 c1-51 c1-33 c1-18 c1-19 c1-52 c1-s c1-55 c1-56 c1-57 c1-58 c1-2c c1-2a c1-29 c1-2b c1-b c1-4b c1-1e c1-26 c1-53 c1-54 c1-1f c1-1g c1-1h c1-1i')]"));
	     par.click();
	     
	     TakesScreenshot ts = (TakesScreenshot) wd;
		 File Source = ts.getScreenshotAs(OutputType.FILE);
		 File target = new File("C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\target"+"party"+".png");
		 FileHandler.copy(Source, target);
	 
	 }
	 public static void close()
	 {
		 wd.quit();
	 }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*NavigateInteractSS.setup();
		NavigateInteractSS.url();
		NavigateInteractSS.party();
		NavigateInteractSS.screenshot();
		
	*/
		
	}

}
