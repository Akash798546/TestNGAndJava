package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	static ExtentReports extent;
	
	public static ExtentReports getReport()
	{
		if(extent==null)
		{
			extent = new ExtentReports();
			ExtentSparkReporter	spark=new ExtentSparkReporter("Extent_Index_report.html");
			  spark.config().setTheme(Theme.DARK);
			  spark.config().setReportName("Facebook Login Report");
			  extent.attachReporter(spark);
			  
		}
		return extent;
	}
	
	
}

