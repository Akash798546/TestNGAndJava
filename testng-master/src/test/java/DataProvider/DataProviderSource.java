package DataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSource {
  @DataProvider(name="TestData")
  public static Object[][] getTestTypeData(ITestContext context) {
	  
	  String testcase=context.getName();
	  if("IntregationLevel".equals(testcase))
	  {
		  return new Object[][] {{"IntregationLevel data "}};
	  }
	  else if("AcceptanceLevel".equals(testcase))
	  {
		  return new Object[][] {{"AcceptanceLevel data "}};
	  }
	  else
	  {
		  return new Object[][] {{"Common Scenario data "}};
	  }
  }
	  @DataProvider(name="scenarioData")
	  public static Object[][] getScenarioTypeData(Method method) {
		  
		  String testcase=method.getName();
		  if("Scenario1".equals(testcase))
		  {
			  return new Object[][] {{"Scenario data 1"}};
		  }
		  else if("Scenario2".equals(testcase))
		  {
			  return new Object[][] {{"Scenario data 2"}};
		  }
		  else
		  {
			  return new Object[][] {{"Common Scenario data "}};
		  }
		  
	  
	  
	  
	  
	  
	  
	  
  }
}
