package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
  
	
	 public static WebDriver OpenEdge()
    {
	    System.setProperty("webdriver.edge.driver","C:\\study\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    return driver;

    } 
	    
}
	  
	 