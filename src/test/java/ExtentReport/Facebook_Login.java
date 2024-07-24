package ExtentReport;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Facebook_Login extends NewTest{
	
	
	
  @Test(invocationCount=5)
  public void faceBook_Login() {
	  
	  System.out.println("This is Test 1 ----->: "+Thread.currentThread().getId());
	  test.info("Facebook Login Test 1");
	  test.info("Facebook Login Test 2");
	  test.info("Facebook Login Test 3");
	  test.info("Facebook Login Test 4");
	  test.info("Facebook Login Test 5");
	  test.fail("Validation Fail..........");
	  Assert.assertEquals(300, 400);
	  test.fail("Facebook Login Test failllll.............");
		  
  }
  
  @Test
  public void faceBook_Registration() {
	  System.out.println("This is Test 2 : "+Thread.currentThread().getId());
	
	  test.info("Facebook Registraion Test 1");
	  test.info("Facebook Registraion Test 2");
	  test.info("Facebook Registraion Test 3");
	  test.info("Facebook Registraion Test 4");
	  test.info("Facebook Registraion Test 5");
	  test.info("Facebook Registraion Test 6");
	   
	  
  }
  
  
  @Test
  public void faceBook_TimeLine() {
	  
	  System.out.println("This is Test 3 : "+Thread.currentThread().getId());
	  test.info("Facebook TimeLine Test 1");
	  test.info("Facebook TimeLine Test 2");
	  test.info("Facebook TimeLine Test 3");
	  test.info("Facebook TimeLine Test 4");
	  test.info("Facebook TimeLine Test 5");
	  test.info("Facebook TimeLine Test 6");
	   
	  
  }
 
  
  @Test
  public void faceBook_Profile() {
	  
	  System.out.println("This is Test 4 : "+Thread.currentThread().getId());
	  test.info("Facebook TimeLine Test 1");
	  test.info("Facebook TimeLine Test 2");
	  test.info("Facebook TimeLine Test 3");
	  test.info("Facebook TimeLine Test 4");
	  test.info("Facebook TimeLine Test 5");
	  test.info("Facebook TimeLine Test 6");
	   
	  
  }
  
  
  @Test
  public void faceBook_posts() {
	  
	  System.out.println("This is Test 5 : "+Thread.currentThread().getId());
	  test.info("Facebook TimeLine Test 1");
	  test.info("Facebook TimeLine Test 2");
	  test.info("Facebook TimeLine Test 3");
	  test.info("Facebook TimeLine Test 4");
	  test.info("Facebook TimeLine Test 5");
	  test.info("Facebook TimeLine Test 6");
	   
	  
  }
  
  
  @Test
  public void faceBook_Notification() {
	  
	  System.out.println("This is Test 6 : "+Thread.currentThread().getId());
	  test.info("Facebook TimeLine Test 1");
	  test.info("Facebook TimeLine Test 2");
	  test.info("Facebook TimeLine Test 3");
	  test.info("Facebook TimeLine Test 4");
	  test.info("Facebook TimeLine Test 5");
	  test.info("Facebook TimeLine Test 6");
	   
	  
  }
  
  
  @Test
  public void faceBook_HomePage() {
	  
	  System.out.println("This is Test 7 : "+Thread.currentThread().getId());
	  test.info("Facebook TimeLine Test 1");
	  test.info("Facebook TimeLine Test 2");
	  test.info("Facebook TimeLine Test 3");
	  test.info("Facebook TimeLine Test 4");
	  test.info("Facebook TimeLine Test 5");
	  test.info("Facebook TimeLine Test 6");
	   
	  
  }
}
