package DataProvider;

import org.testng.annotations.Test;

public class FacebookIntregation {
  @Test(dataProvider="TestFacebook",dataProviderClass=Facebook.class)
  public void FacebookLogin(String data) {
	  System.out.println("The Facebook login : "+data);
  }
}
