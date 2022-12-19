package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo 
{

	@Test
	public void test1() throws MalformedURLException
	{
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.CHROME);
		
		cap.setPlatform(Platform.WINDOWS);
		
		URL url=new URL("http://127.0.0.1:5555/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url, cap);
		
		driver.get("http://www.toolsqa.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.quit();
		
		
		
	}
	
	
}
