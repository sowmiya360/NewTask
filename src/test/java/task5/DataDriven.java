package task5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("WebDrive.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
	    wd=new ChromeDriver();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DataDriven.setup();
		//DataDriven.url();
		//DataDriven.login("uashd","bdkjas");
	}

}
