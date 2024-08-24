package DataProvider;

import org.testng.annotations.Test;

public class FacebookRegistrationIntregation {
  @Test(dataProvider="TestFacebook",dataProviderClass=Facebook.class)
  public void FacebookRegistration(String data) {
	  System.out.println("The is facebook Registration : "+data);
  }
}
