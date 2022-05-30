package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.ApplicationHeader;
import PomClasses.LoginPage;

public class verifyActitimeHeaders {
	
public static void main(String[] args) throws InterruptedException  {
	

		System.setProperty("webdriver.chrome.driver","C:\\study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1st Test Case
		driver.get("https://online.actitime.com/kpatil/login.do");
		

		 LoginPage loginPage = new LoginPage(driver);	
		 loginPage.sendsUsername();
		 loginPage.sendPassword();
		 loginPage.clickOnLoginButton();
		 
		 Thread.sleep(3000); 
		 
		 ApplicationHeader applicationheader = new ApplicationHeader(driver); 		
		applicationheader.ClickOntasksTab();
		
	    String url =driver.getCurrentUrl();
		String title= driver.getTitle();
		
	if (url.equals("https://online.actitime.com/kpatil/tasks/tasklist.d")&& title.equals("actiTIME -  Task List"))
	{
		System.out.println("pass");
	}

	else
	{
		System.out.println("fail");
	}
	applicationheader.Logout();
	
	
	
		//test 2
	driver.get("https://online.actitime.com/kpatil/login.do");

	 loginPage = new LoginPage(driver);	
	loginPage.sendsUsername();
	 loginPage.sendPassword();
	 loginPage.clickOnLoginButton();
	 
	Thread.sleep(5000); 
	 applicationheader = new ApplicationHeader(driver); 		
	applicationheader.ClickOnreportTab();
	url=	driver.getCurrentUrl();
	title= driver.getTitle();
	if (url.equals("https://online.actitime.com/kpatil/reports/dashboard.do")&& title.equals("actiTIME -  Reports Dashboard"))
	{
	System.out.println("pass");
	}

	else
	{
	System.out.println("fail");
	}
	
//	applicationheader.Logout();
//	driver.close();
	
	System.out.println("hello")
	
	
			
			//test4

//	driver.get("https://online.actitime.com/kpatil/login.do");

//	LoginPage Loginpage = new LoginPage(driver);	
//	//login.LoginInto();
//	Thread.sleep(5000); 
//	ApplicationHeader applicationheader1= new ApplicationHeader(driver); 		
//	applicationheader.ClickOnusersTab();
//	url=	driver.getCurrentUrl();
//	title= driver.getTitle();
//	if (url.equals("https://online.actitime.com/kpatil/administration/userlist.do")&& title.equals("actiTIME -  Task List"))
//	{
//	System.out.println("pass");
//	}
//
//	else
//	{
//	System.out.println("fail");
//	}
//	applicationheader.Logout();
//	driver.close();
//	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.sendsUsername();
//		loginPage.sendPassword();
//		loginPage.clickloginButton();
//		
//		ApplicationHeader applicationHeader = new ApplicationHeader(driver);

//		applicationHeader.clickOnTasksTab();
//		
//		 String url = driver.getCurrentUrl();
//		String  title = driver.getTitle();
//		
//		if(url.equals("https://online.actitime.com/kpatil/tasks/tasklist.do")&& title.equals("ActiTime"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		
		
		//2nd Test Case
		

//		applicationHeader.clickOnReportsTab();
//		
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		
//		if(url.equals("https://online.actitime.com/kpatil/reports/dashboard.do")&& title.equals("ActiTime"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		
		
		//3rd Test Case
		
//		applicationHeader.clickOnUserTab();
//		
//		 url = driver.getCurrentUrl();
//		 title = driver.getTitle();
//		
//		if(url.equals("https://online.actitime.com/kpatil/administration/userlist.do")&& title.equals("ActiTime"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}

		
		
		
}	
		
	}


