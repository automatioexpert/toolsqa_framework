package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utility.BaseClass;

public class VerifyHomePage extends BaseClass
{

	@Test
	public void verifyAccountLink()
	{
		 
		BaseClass.logger=report.startTest("verifyAccountLink");
		
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		home.verifyPageTitle();
		
		home.clickOnAccountLink();
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
		login.LoginToApplication("asdas","asdasd");
			
		
		
	}
	
}
