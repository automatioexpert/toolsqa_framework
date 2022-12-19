package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportDemo1 
{

	@Test
	public void test1()
	{
		ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"\\Report\\Toolsqa.html");
		
		ExtentTest logger=report.startTest("VerifyLogin", "This test will verify login details");
		
		logger.log(LogStatus.INFO, "Browser started");
		
		logger.log(LogStatus.INFO, "Application started");
		
		logger.log(LogStatus.PASS, "Verified error message");
		
		logger.log(LogStatus.INFO,"Error msg displayed", logger.addScreenCapture("C:\\Workspace_Toolsqa_28_May\\Toolsqa\\Screenshots\\RegistrationPage.png"));
		
		report.endTest(logger);
		
       ExtentTest logger1=report.startTest("Verify Email", "This test will verify email status");
		
       
       logger1.log(LogStatus.INFO,"Login Section" ,logger1.addScreenCapture("C:\\Workspace_Toolsqa_28_May\\Toolsqa\\Screenshots\\asdasdasd.png"));
       
       logger1.log(LogStatus.INFO, "Browser started");
		
       logger1.log(LogStatus.INFO, "Application started");
		
       logger1.log(LogStatus.FAIL, "Email verified");
       
       logger1.log(LogStatus.INFO,"Logout done",logger1.addScreenCapture("C:\\Workspace_Toolsqa_28_May\\Toolsqa\\Screenshots\\Toolsqa.png"));
		
		report.endTest(logger1);
		
		
		report.flush();

	}
	
}
