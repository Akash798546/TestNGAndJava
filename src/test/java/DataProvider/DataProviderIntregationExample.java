 package DataProvider;

import org.testng.annotations.Test;

public class DataProviderIntregationExample {
  @Test(dataProvider="TestData",dataProviderClass=DataProviderSource.class)
 public void IntregationTest(String data) {
	  
	  System.out.println("Intregation Testing: Data("+data+")");
  }
}
 