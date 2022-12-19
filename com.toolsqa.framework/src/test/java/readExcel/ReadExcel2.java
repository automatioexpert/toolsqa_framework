package readExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import DataProvider.ExcelConfig;

public class ReadExcel2 
{

	@Test
	public void readExcel()
	{
		
		ExcelConfig excel=new ExcelConfig();
		
		System.out.println(excel.getStringData("Login", 0, 0));
		
		System.out.println(excel.getNumericData("Login", 0, 1));
	}
	
	
}
