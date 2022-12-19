package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utility.BaseClass;

public class DDT extends BaseClass
{

	
	@Test(dataProvider="TestData")
	public void createAccount(String testUsername,String testPassword)
	{
		
     HomePage home=PageFactory.initElements(driver, HomePage.class);
     
     home.clickOnAccountLink();
     
     LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
     login.LoginToApplication(testUsername, testPassword);
     
	}
	
	
	
	@DataProvider(name="TestData")
	public Object[][] applicationData()
	{
		
		System.out.println("Data is getting ready");
		
	    Object [][]arr=new Object[2][2];	
	
	    arr[0][0]="Selenium";
	    arr[0][1]="IDE";
	    arr[1][0]="QTP";
	    arr[1][1]="HP";
	    
	    System.out.println("==========Data provider is ready to use================");
	    return arr;
	   
	}
	
	
}
