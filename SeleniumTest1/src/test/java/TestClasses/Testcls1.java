package TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.Base;
import PomClasses.ApplicationHeader;
import PomClasses.LoginPage;

public class Testcls1 {
	
	WebDriver driver;
	ApplicationHeader applicationHeader;
	LoginPage loginpage;
	
	@Parameters("browserName")
	@BeforeTest
	public void launchbrowser(String browser) {
		System.out.println(browser);
	
	if(browser.equals("Chrome"))
	{
		driver = Base.OpenChromeBrowser();
	}
	if(browser.equals("Edge"))
	{
		driver = Base.OpenEdge();
	}
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@BeforeClass
	public void createPOMobject() {
		applicationHeader = new ApplicationHeader(driver);
		 loginpage = new LoginPage(driver);
		
	 }
		
	
	 @BeforeMethod
	 public void loginToApplication()
	 {
		 driver.get("https://online.actitime.com/kpatil/login.do");
				
		 loginpage.sendsUsername();
		 loginpage.sendPassword();
		 loginpage.clickOnLoginButton();
		  
		 
	 }  
	 
	 @Test
	 public void verifyTaskTab()
	 {
		 applicationHeader.ClickOntasksTab();
			
		    String url = driver.getCurrentUrl();
			String title = driver.getTitle();
			
			Assert.assertEquals("https://online.actitime.com/kpatil/tasks/tasklist.do",url);
			Assert.assertEquals("actiTIME - Task List",title);
	 }
		
	 
	 
	 @Test
	 public void verifyReportsTab()
	 {
		 applicationHeader.ClickOnreportTab();
		 
			String url=	driver.getCurrentUrl();
			String title= driver.getTitle();
			
			Assert.assertEquals("https://online.actitime.com/kpatil/reports/dashboard.do",url);
			Assert.assertEquals("actiTIME - Reports Dashboard",title);
	 }
		
	 
	 
	 @AfterMethod
	 public void logoutFromApplication()
	 {
		
		applicationHeader.Logout();		 
	 }
	 
	 @AfterClass
	 public void clearObject() {
		 loginpage = null;
		 applicationHeader = null;
	 }
	 
	 @AfterTest
	 public void closedBrowser() {
		 driver.close();
		 driver = null;
		 System.gc(); //garbage collector 
	 }
	 
      


	 
}
