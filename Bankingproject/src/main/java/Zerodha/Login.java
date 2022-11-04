package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	//step 1: to declare global variable(data member)
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	
	//step 2: initiolization of variable
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step 3: Method creat
	
	public void enterUN() throws InterruptedException
	{
		username.sendKeys("ZOL660");
	   Thread.sleep(2000);
	}
	
	public void enterPWD() throws InterruptedException
	{
		password.sendKeys("7028109490");
		   Thread.sleep(2000);
	}
	
	public void login()
	{
		loginbutton.click();
	
	}
}
