package BasicTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsCheck {
  @BeforeSuite
  public void BeforeSuiteChk()
  {
	  System.out.println("This is Before Suite Check");
  }
  
  @BeforeTest
  public void BeforeTestCheck()
  {
	  System.out.println("This is the Before Test");
  }
  
  @AfterTest
  public void AfterTestCheck()
  {
	  System.out.println("This is the After Test check");
  }
  
  @BeforeClass
  public void BeforeClassCheck()
  {
	  System.out.println("This is the Before Class check");
  }
  
  @AfterClass
  public void AfterClassCheck()
  {
	  System.out.println("This is the After Class check");
  }
  
  
  
  @BeforeMethod
  public void BeforeMethodCheck()
  {
	  System.out.println("This is the Before Method check");
  }
  
  @AfterMethod
  public void AfterMethodCheck()
  {
	  System.out.println("This is the After Method check");
  }
  
  
  
  @Test
  public void Test1()
  {
	  
	  System.out.println("This is the test");
  }
  

  @Test
  public void Test2()
  {
	  
	  System.out.println("This is the test2");
  
  
  }
  
  

  @Test
  public void Test3()
  {
	  
	  System.out.println("This is the test3");
  
  }
  @AfterSuite
  public void AfterSuiteChk()
  {
	  System.out.println("This is After Suite Check");
  
  
}
}