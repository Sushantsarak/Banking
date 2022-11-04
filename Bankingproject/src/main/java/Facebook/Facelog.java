package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facelog {
// to declare global variable
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	@FindBy (xpath="//button[@value='1']")
	private WebElement button;
	  //To initialisation of variable
	public Facelog(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// method creation
	
	public void EnterUn()
	{
		username.sendKeys("7028109490");
	}
	public void EnterPw()
	{
		password.sendKeys("7709088710");
	}
	public void Loginbt()
	{
		button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
