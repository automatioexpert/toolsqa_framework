package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utility.BaseClass;

public class BrowserFactory extends BaseClass
{
	
	public WebDriver startBrowsers(String browserName)
	{
		
		
			if(browserName.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromePath());
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("IE"))
			{
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setCapability(InternetExplorerDriver.NATIVE_EVENTS, true);
				System.setProperty("webdriver.ie.driver",DataProviderFactory.getConfig().getIEPath());
				driver=new InternetExplorerDriver(cap);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			return driver;
		
			
	}

}
