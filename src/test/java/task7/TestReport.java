package task7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestReport {
	
public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\sowmi\\eclipse-workspace\\NewTask\\src\\test\\resources\\chromedriver.exe");
		wd=new ChromeDriver();
	}

	public static void url()
	{
	  wd.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	  wd.manage().window().maximize();
	}
	public static void formfill(String firstname,String lastname,String contactno,String country,String city,String email)
	{
		WebElement fname=wd.findElement(By.xpath("//input[contains(@name,'RESULT_TextField-1')]"));
		fname.sendKeys(firstname);
		WebElement lname=wd.findElement(By.xpath("//input[contains(@name,'RESULT_TextField-2')]"));
		lname.sendKeys(lastname);
	    WebElement phone=wd.findElement(By.xpath("//input[contains(@name,'RESULT_TextField-3')]"));
	    phone.sendKeys(contactno);

	    WebElement coun= wd.findElement(By.xpath("//input[contains(@name,'RESULT_TextField-4')]"));
	    coun.sendKeys(country);
	    WebElement cit= wd.findElement(By.xpath("//input[contains(@name,'RESULT_TextField-5')]"));
	    cit.sendKeys(city);
	    WebElement mail= wd.findElement(By.xpath("//input[contains(@name,'RESULT_TextField-6')]"));
	    mail.sendKeys(email);
	    
	  
	   WebElement drop =wd.findElement(By.xpath("//select[contains(@id,'RESULT_RadioButton-9')]"));
	   Select d =new Select(drop);
	   List<WebElement> dd=d.getOptions();
	   System.out.println(dd);
	   d.selectByVisibleText("Evening");
	  
	      
	}
	
	public static void close()
	{
		wd.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
