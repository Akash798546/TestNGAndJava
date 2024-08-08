package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParameterexample {
  @Test(dataProvider="scenarioData" ,dataProviderClass=DataProviderSource.class)
  public void Scenario1(String scenariodata) {
	  System.out.println("Scenario testing: Data("+scenariodata+")");
  }
  
  @Test(dataProvider="scenarioData",dataProviderClass=DataProviderSource.class)
  public void Scenario2(String scenariodata) {
	  System.out.println("Scenario testing: Data("+scenariodata+")");
  }
  
  
  @Test(dataProvider="scenarioData",dataProviderClass=DataProviderSource.class)
  public void ScenarioCommon(String scenariodata) {
	  System.out.println("Common Scenario testing: Data("+scenariodata+")");
  }
  
  
  
}
