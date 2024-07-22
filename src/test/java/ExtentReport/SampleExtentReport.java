package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleExtentReport {
  @Test
  public void sampleReport() {
	  
	  
	  ExtentReports extent=new ExtentReports();
	  ExtentSparkReporter spark=new ExtentSparkReporter("My_sampleReport.html");
	  spark.config().setTheme(Theme.DARK);
	  spark.config().setReportName("Sample Extent Report");
	  extent.attachReporter(spark);
	  
	  ExtentTest test=extent.createTest("Facebook Login Test");
	  test.info("My first Test Case");
	  test.info("My Second Test Case");
	  test.info("My Third Test Case");
	  test.info("My Fourth Test Case");
	  test.info("My fifth Test Case");
	  
	  
	  ExtentTest hometest=extent.createTest("Facebook HomePage Test");
	  hometest.info("My first HomePage Test Case");
	  hometest.info("My Second HomePage Test Case");
	  hometest.pass("HomePage Test is pass");
	  hometest.fail("Test fail Duet to some reason");
	  
	  extent.flush();
  }
}
