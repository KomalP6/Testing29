package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy (xpath = "//input[@name='username']") 
	private WebElement username ;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement keepMeLoginCheckbox;
	
    @FindBy (xpath = "//a[@id='loginButton']")
    private WebElement login;
    
    private WebDriver driver;
    private WebDriverWait wait;
    
    
    
	public LoginPage(WebDriver driver) //driver1=driver=new chromeDriver
	{
		PageFactory.initElements(driver,this);	
		this.driver = driver ;
		//wait = new WebDriverWait(driver, 30);   //2 0r 3 element ke liye same timer lagaya to used krna
	}
	
	public void sendsUsername(){
		wait = new WebDriverWait(driver, 30); //20 sec
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("kvpatil1357@gmail.com");		
	}
	
	public void sendPassword() {
	    wait = new WebDriverWait(driver, 10); //10 sec
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Patil#99");
	}
	
	public void selectKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	
	public void clickOnLoginButton() {
		login.click();
	}
	
	//or
	
	public void loginpagetoapplication(){
		username.sendKeys("kvpatil1357@gmail.com");
		password.sendKeys("Patil#99");
		keepMeLoginCheckbox.click();
		login.click();
	}

		
}


