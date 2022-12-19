package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.interactions.Action;

public class ConfigReader
{

	Properties pro;
	
	public ConfigReader()
	{
		File src=new File("./Configuration/config.properties");
		
	
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			
			pro.load(fis);
			
			System.out.println("Config file is loaded");
		} 
		catch (Exception e) {
			
			System.out.println("Unable to load config file please check the exception log "+e.getMessage());
		}
	}
	
	
	public String getChromePath()
	{
		return pro.getProperty("ChromePath");
	}
	
	public String getIEPath()
	{
		return pro.getProperty("IEPath");
	}
	
	
	public String getApplicationURL()
	{
		return pro.getProperty("url1");
	}
	
	public String getProductionURL()
	{
		return pro.getProperty("url2");
	}
	
	public String getTestURL()
	{
		return pro.getProperty("testurl");
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	
}
