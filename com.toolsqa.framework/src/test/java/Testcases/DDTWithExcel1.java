package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Factory.DataProviderFactory;
import Pages.HomePage;
import Pages.LoginPage;
import Utility.BaseClass;

public class DDTWithExcel1 extends BaseClass
{

	@Test(dataProvider="TestData")
	public void createAccount(String testUsername,String testPassword,String extra)
	{
		
     HomePage home=PageFactory.initElements(driver, HomePage.class);
     
     home.clickOnAccountLink();
     
     LoginPage login=PageFactory.initElements(driver, LoginPage.class);
     System.out.println(testUsername);
     System.out.println(testPassword);
     login.LoginToApplication(testUsername, testPassword);
     
     System.out.println("I have extra parameter which is "+extra);
     
	}
	
	
	
	@DataProvider(name="TestData")
	public Object[][] applicationData()
	{
		
		System.out.println("Data is getting ready");
		
		int rowCount=DataProviderFactory.getExcelConfig().getNumberOfRows("ToolsqaLogin");
		
		System.out.println("Test will execute "+ rowCount +"Times");
		
	    Object [][]arr=new Object[rowCount-1][3];
	    
	    for(int i=1;i<rowCount;i++)
	    {
	    	
	    	for(int j=0;j<DataProviderFactory.getExcelConfig().getNumberOfColumns("ToolsqaLogin", i);j++)
	    	{
	    		arr[i-1][j]=DataProviderFactory.getExcelConfig().getData("ToolsqaLogin", i, j);	
	    	}
	    	
	    }
	    
	    System.out.println("==========Data provider is ready to use================");
	    return arr;
	   
	}
	
	
}
