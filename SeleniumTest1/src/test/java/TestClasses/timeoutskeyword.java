package TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class timeoutskeyword {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("Before Method");
	 }
	 
	 @Test (timeOut = 2000) //2sec
	 public void testB() throws InterruptedException
	 {
		 System.out.println("Test B");
		 Thread.sleep(5000);  //5sec
		 System.out.println("hello");
	 }
	 
	 @Test (priority = 2)
	 public void testA()
	 {
		 System.out.println("Test A");
	 }
	
	 @Test (priority = 1)
	 public void testD()
	 {
		 System.out.println("Test D");
		
	 }
	 
	 @Test (priority = 3)
	 public void testC()
	 {
		 System.out.println("Test C");
		
	 }
	 
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("After Method");		 
	 }
	 
	 @AfterClass
	 public void afterClass()
	 {
		 System.out.println("After Class");
	 }


}
