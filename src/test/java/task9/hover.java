package task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import WebDriver.Chromedriver;

public class hover extends Chromedriver{
	
	public static void url()
	{
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
	}
	
	public static void hove()
	{
		Actions A = new Actions(wd);
		WebElement fashion = wd.findElement(By.xpath("//div[contains(@aria-label,'Fashion')]"));
	    A.moveToElement(fashion).perform();
	    
	   WebElement fashionlist = wd.findElement(By.linkText("Women Ethnic"));
	   fashionlist.click();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*  hover.Setup();
		hover.url();
		hover.hove();
	*/
	}

}
