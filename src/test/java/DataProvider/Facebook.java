package DataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class Facebook {
  @DataProvider(name="TestFacebook")
  public Object[][] facebookData(ITestContext context)
  {
	  
	  String test=context.getName();
	  if("FacebookLogin".equals(test))
	  {
		  return new Object[][] {{"This is facebook login page"}};
	  }
	  else if("FacebookRegistration".equals(test))
	  {
		 return new Object[][] {{"This is registration page"}};
	  }
	  else
	  {
		  return new Object[][] {{"This is common Test"}};
	  }
  }
  
  
  
  
  @DataProvider(name="TestlinkedIn")
  public Object[][] LinkedInData(Method method)
  {
	  
	  String testcase=method.getName();
	  if("LinkedInloginTest".equals(testcase))
	  {
		  return new Object[][] {{"This is LinkedIn login page"}};
	  }
	  else if("LinkedInRegistrationTest".equals(testcase))
	  {
		 return new Object[][] {{"This is LinkedIn Registration page"}};
	  }
	  else
	  {
		  return new Object[][] {{"This is LinkedIn common Test"}};
	  }
  }
}
  
  

