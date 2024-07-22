package DataProvider;

import org.testng.annotations.Test;

public class DataProviderAcceptanceExample {
  @Test(dataProvider="TestData",dataProviderClass=DataProviderSource.class)
  public void AcceptanceTest(String data) {
	  
	  System.out.println("Acceptance Testing: Data("+data+")");
  }
}
