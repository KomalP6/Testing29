package TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dependsonmethod {
	
	
	
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
	                                           //AND Logic
	 @Test ( priority = 0, dependsOnMethods = {"testC" ,"testD"})
	 public void testB()
	 {
		 System.out.println("test B");
	 }
	 
	 @Test (priority = 2)
	 public void testA()
	 {
		 System.out.println("test A");
	 }
	
	 @Test (priority = 1)
	 public void testD()
	 {
		 System.out.println("test D");
		
	 }
	 
	 @Test (priority = 3)
	 public void testC()
	 {
		 System.out.println("test C");
		 Assert.fail();
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
