package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo1 {

	public static void main(String[] args) 
	{
	
   
		
		WebDriver driver=new  FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
        FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
        
        wait.pollingEvery(1, TimeUnit.MILLISECONDS);
        
        wait.withTimeout(40, TimeUnit.SECONDS);
        
        wait.ignoring(NoSuchElementException.class);

        
        WebElement element= wait.until(new Function<WebDriver,WebElement>(){

			public WebElement apply(WebDriver ldriver) 
			{
				
				
				WebElement clock=ldriver.findElement(By.id("colorVar"));
				
				String color=clock.getAttribute("style");
				
				if(color.contains("red"))
				{
					System.out.println("Color present is "+color);
					return clock;
				}
				else{
					System.out.println("Color present is "+color);
					return null;
				}
				
				
			}
        	
        	
        	
        });
      
      System.out.println("Color appeared "+element.isDisplayed());
      
      System.out.println(element.getCssValue("background-color"));
      
      driver.quit();

	}

}
