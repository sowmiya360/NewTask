package task8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class POMLogin extends Driver {
	
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
	
	
/*	public static void defaultuserpass(String emailid,String password)
	{
	  login(emailid,password);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	/*	Setup();
     	url();
		login("sowmiyamani2097@gmail.com", "Ganeshsowmiya@1");
	*/
	}

}
