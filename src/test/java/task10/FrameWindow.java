package task10;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import WebDriver.Chromedriver;

public class FrameWindow extends Chromedriver{
	
	public static void url()
	{
		wd.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		wd.manage().window().maximize();
	}
	
	public static void frame()
	{
	   wd.switchTo().frame("globalSqa");
	   WebElement sel = wd.findElement(By.xpath("//div[contains(@class,'pic_holder')]"));
	   if(sel.isDisplayed())
	   {
		   System.out.println("viewed");
	   }
	   
	   wd.switchTo().parentFrame();
	   
	}
	
	public static void window() 
	{
	  wd.switchTo().newWindow(WindowType.WINDOW);
	  wd.get("https://youtube.com/");

	  System.out.println(wd.getTitle());
	  
	  WebElement search = wd.findElement(By.xpath("//input[contains(@id,'search')]"));
	  search.sendKeys("tamil songs");
	  search.submit();
	  
	  ArrayList<String> win = new ArrayList<>(wd.getWindowHandles());
	  wd.switchTo().window(win.get(1)).close();
	 
	  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*FrameWindow.Setup();
		FrameWindow.url();
		FrameWindow.frame();
		FrameWindow.window();
		
		*/
	}

}
