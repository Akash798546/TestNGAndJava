package ExtentReport;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class FaceBook_Registration {
	
	 ExtentReports extent;
	 ExtentSparkReporter spark;
	 ExtentTest test;
	@BeforeMethod
	public void extentReportStart()
	{
		extent= ExtentManager.getReport();
		  test=extent.createTest("Facebook loginTest");
	}
	  @Test
	  public void faceBookRegistration() {
		  
		
		  test.info("Facebook Registraion Test 1");
		  test.info("Facebook Registraion Test 2");
		  test.info("Facebook Registraion Test 3");
		  test.info("Facebook Registraion Test 4");
		  test.info("Facebook Registraion Test 5");
		  test.info("Facebook Registraion Test 6");
		   
		  
	  }
	  
	  @AfterMethod
	  public void quitReport()
	  {
		   extent.flush();

	  }
}
