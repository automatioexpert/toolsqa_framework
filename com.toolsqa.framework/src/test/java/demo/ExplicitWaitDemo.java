package demo;

/**
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author 30175102
 *
 */
public class ExplicitWaitDemo {

	/**
	 *Use of Explicit Wait
	 */
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	
		// Increase the timeout
	    WebDriverWait wait =  new WebDriverWait(driver, 20);
	    
	     Boolean text =  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("Deattach")));
	     
	     System.out.println("Text Invisible" +text);
	     
	     driver.quit();

	     

	}

}
