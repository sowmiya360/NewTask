package task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import WebDriver.Chromedriver;

public class DragDrop extends Chromedriver{
	
	public static void url()
	{
		wd.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		wd.manage().window().maximize();
	}
	 public static void draganddrop()
	 {
		 Actions A = new Actions(wd);
		 
		List<WebElement> drag = wd.findElements(By.xpath("//span[contains(@draggable,'true')]"));
		WebElement drop =wd.findElement(By.xpath("//div[contains(@id,'mydropzone')]"));
		
		for(WebElement d :drag)
		{
		 
		 if(d.isDisplayed())
		 {
			 A.dragAndDrop(d, drop).build().perform();
			 System.out.println("success");
		 }
		 else
		 {
			 System.out.println("sorry");
		 }
		}
	 }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* DragDrop.Setup();
		url();
		draganddrop();		
	*/
		}
	

}
