package ExtentReport;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewTest {

	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;

	@BeforeMethod
	public void initializingExtentReport(ITestResult result) {

		extent = ExtentManager.getReport();
		test = extent.createTest(result.getMethod().getMethodName().toUpperCase());

	}

	@AfterMethod
	public void quitReport() {
		extent.flush();

	}
}
