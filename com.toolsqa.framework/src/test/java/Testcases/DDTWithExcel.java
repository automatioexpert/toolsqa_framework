package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Factory.DataProviderFactory;
import Pages.HomePage;
import Pages.LoginPage;
import Utility.BaseClass;

public class DDTWithExcel extends BaseClass
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
		
		int rowCount=DataProviderFactory.getExcelConfig().getNumberOfRows("ToolsqaLogin");
		
		System.out.println("Test will execute "+ rowCount +"Times");
		
	    Object [][]arr=new Object[rowCount][2];	
	
	    
	    for(int i=0;i<rowCount;i++)
	    {
	    	arr[i][0]=DataProviderFactory.getExcelConfig().getData("ToolsqaLogin", i, 0);
	    	arr[i][1]=DataProviderFactory.getExcelConfig().getData("ToolsqaLogin", i, 1);
	    }
	    
	    System.out.println("==========Data provider is ready to use================");
	    return arr;
	   
	}
	
	
}
