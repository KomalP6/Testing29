package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

	
	
	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy (xpath="//a[@class='content reports']")
	private WebElement report;
	
	@FindBy (xpath="//a[@class='content users']")
	private WebElement users;
	
	@FindBy (xpath="//a[text()='Logout']")
	private WebElement logout;
	
	
 public ApplicationHeader(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void ClickOntasksTab()
{
tasks.click();
}

public void ClickOnreportTab()
{
report.click();
}

public void ClickOnusersTab()
{
users.click();
}
public void Logout()
{
logout.click();
	
}
	
}
	
	
	
	
	
	


	
//	@FindBy (xpath = "//a[@class='content tasks']")
//	private WebElement tasks;
	
//	@FindBy (xpath = "//a[@class='content reports']")
//	private WebElement reports;
//	
//	@FindBy (xpath = "//a[@class='content users']")
//	private WebElement user;
//	
//	public ApplicationHeader(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
	
//	public void clickOnTasksTab() {
//		tasks.click();
//	}
	
//	public void clickOnReportsTab() {
//		reports.click();
//	}
//	
//	public void clickOnUserTab() {
//		user.click();
//	}
//	
//}
//	