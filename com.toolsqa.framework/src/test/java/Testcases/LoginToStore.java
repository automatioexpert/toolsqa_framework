package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utility.BaseClass;

public class LoginToStore extends BaseClass
{

	@Test
	public void testInvalidLogin()
	{
		
	    HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		home.verifyPageTitle();
		
		home.clickOnAccountLink();
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
			
	     login.LoginToApplication("Selenium", "Webdriver");
		
	}
	
	
}
