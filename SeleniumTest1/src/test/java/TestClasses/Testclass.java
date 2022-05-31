package TestClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass {
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite TestClass1");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test TestClass 1");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class TestClass 1");
	}
	
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("Before Method TestClass 1");
	 }
	 
	 @Test
	 public void testB()
	 {
		 System.out.println("test B TestClass 1");
	 }
	 
	 
	 @Test
	 public void testA()
	 {
		 System.out.println("Test A TestClass 1");
	 }
	 
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("After Method TestClass 1");		 
	 }
	 
	 @AfterClass
	 public void afterClass()
	 {
		 System.out.println("After Class TestClass 1");
	 }
	 
	 @AfterTest
	 public void aftertest()
	 {
		 System.out.println("After Test TestClass 1");
	 }
 
	 @AfterSuite
	 public void afterSuite()
	 {
		 System.out.println("After Suite TestClass 1");
	 }
}
