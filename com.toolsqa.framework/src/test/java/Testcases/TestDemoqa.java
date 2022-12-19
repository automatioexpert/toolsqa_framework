package Testcases;

import org.testng.annotations.Test;

import Utility.BaseClass;

public class TestDemoqa extends BaseClass
{

	@Test
	public void test1()
	{
		System.out.println(driver);
		String title=driver.getTitle();
		System.out.println("Title is "+title);
	}
	

	@Test
	public void test2()
	{
		System.out.println(driver);
		String url=driver.getCurrentUrl();
		System.out.println("My Test Current URL is "+url);
	}
	
}
