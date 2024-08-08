package BasicTest;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
  @Test
  public void TestOne() {
	 
	  System.out.println("This is test one");
	  Assert.assertEquals("Login", "login");
  }
  @Test(priority=1)
 public void TestTwo() {
	  
	  System.out.println("This is test Two");
	  Assert.assertEquals(400, 200);
  }
 
 @Test(priority=3)
 public void TestThree() {
	  
	  System.out.println("This is test Three");
 }
 
 @Test(priority=2)
 public void TestFour() {
	  
	  System.out.println("This is test Four");
	  
	  
 }
}
