package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	
	
  @Test(dataProvider="TestlinkedIn",dataProviderClass=Facebook.class)
  public void LinkedInloginTest(String data) 
  {
	  System.out.println("The Data is LinkedInloginTest :"+data);
  }
  @Test(dataProvider="TestlinkedIn",dataProviderClass=Facebook.class)
  public void LinkedInRegistrationTest(String data) 
  {
	  System.out.println("The Data is LinkedInRegistrationTest :"+data);
  }
  @Test(dataProvider="TestlinkedIn",dataProviderClass=Facebook.class)
  public void FacebookCommon(String data) 
  {
	  System.out.println("The Data is :"+data);
  }
}
