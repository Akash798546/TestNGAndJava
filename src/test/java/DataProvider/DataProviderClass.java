package DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
  @Test(dataProvider="getdata")
  public void checkcondition(int actual, int expected) {
	  
	  actual=actual+20;
	  Assert.assertEquals(actual, expected);
  }
  
  @DataProvider()
  public Object[][] getdata()
  {
	  return new Object[][]
			  {
		  {100,120},
		  {200,220},
		  {300,310},
		  {400,420}
			  };
  }
}
