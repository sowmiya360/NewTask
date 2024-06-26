package task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser {
	
	public static WebDriver wd;
	
	public static void browsersetup(String url)
	{
		if(url.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
		    wd=new ChromeDriver();
		}
		else if(url.equalsIgnoreCase("edge"))
		{
			System.setProperty("WebDriver.Edge.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\msedgedriver.exe");
			wd=new EdgeDriver();
		}
		else if(url.equalsIgnoreCase("internet explorer"))
		{
			System.setProperty("WebDriver.InternetExplorer.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		}	
		WebDriverManager.chromedriver();
		
	}
	
	public static void url()
	{
		wd.get("https://candymapper.com/");
		System.out.println(wd.getTitle());
	}
	
	public static void popup()
	{
		wd.manage().window().maximize();
		WebElement pop=wd.findElement(By.id("popup-widget238491-cta"));
		pop.click();
	}
	public static void close()
	{
		wd.quit();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* crossbrowser.browsersetup("edge");
		 crossbrowser.url();
		 crossbrowser.popup();
	*/
	}
	

}
