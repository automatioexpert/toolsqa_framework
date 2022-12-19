package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import Factory.DataProviderFactory;
import Utility.HelperClass;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		driver=ldriver;
	}
	
	@FindBy(how=How.CSS, using="#log")WebElement username;
	
	@FindBy(css="#pwd") WebElement password;
	
	@FindBy(css="#login") WebElement loginButton;
	
	
	public void LoginToApplication()
	{
		username.sendKeys(DataProviderFactory.getExcelConfig().getStringData("Login",0, 0));
		System.out.println("Username enterted ");
		
		password.sendKeys(DataProviderFactory.getExcelConfig().getStringData("Login",0, 1));
		System.out.println("Password enterted ");
		
		loginButton.click();
		System.out.println("Click on login button");
	}
	
	public void LoginToApplication(String username1,String password1)
	{
		HelperClass.highLightElement(driver, username);
		username.sendKeys(username1);
		System.out.println("Username enterted ");
		
		HelperClass.highLightElement(driver, password).sendKeys(password1);
		password.sendKeys(password1);
		System.out.println("Password enterted ");
		
		//loginButton.click();
		HelperClass.highLightElement(driver, loginButton).click();
		
	}
	
	
	
	public void setUsername()
	{
		username.sendKeys(DataProviderFactory.getExcelConfig().getStringData("Login",0, 0));
		System.out.println("Username enterted ");
	}
	
	public void setPassword()
	{
		password.sendKeys(DataProviderFactory.getExcelConfig().getStringData("Login",0, 1));
		System.out.println("Password enterted ");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
		System.out.println("Click on login button");
	}
	
}
