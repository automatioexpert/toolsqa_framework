package configdataReadig;

import org.testng.annotations.Test;

import DataProvider.ConfigReader;

public class readDataConfig
{

	@Test
	public void test1()
	{
	
		ConfigReader reader=new ConfigReader();
		
		System.out.println("Test will start on Browser "+ reader.getBrowser());
		
		System.out.println("Test will start on URL "+ reader.getApplicationURL());
	
		System.out.println("Test will start on Pro URL "+ reader.getProductionURL());
		
		
	}
	
	
	
	
}
