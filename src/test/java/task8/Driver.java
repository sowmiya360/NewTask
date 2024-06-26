package task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

public static WebDriver wd;
	
	public static void Setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
	    wd = new ChromeDriver();
	}
	
	public static void url()
	{
		wd.get("https://heatmap.com/");
		wd.manage().window().maximize();
	}
	
	public static void close()
	{
		wd.quit();
	}
	
}
