package demo;

/**
 * 
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author 30175102
 *
 */
public class ExerciseWaitclass {

	/**
	 *   Check if Visible Button is available 
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		// We have to use visibility condition
	    WebElement Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invisibility"))); 
	
	   System.out.println("Button Displayed" +Button.isDisplayed());
	
	   Button.click();
	
	
		
		
		

	}

}

