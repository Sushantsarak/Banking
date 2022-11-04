package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout1 
{
	@FindBy (xpath="//span[@class='user-id']")
	private WebElement accountswitch; 

	@FindBy (xpath="//a[@target='_self']")
	private WebElement logout1;
	
	
	public Logout1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void accountswitch()
	{
		accountswitch.click();	
	}
	public void logout1()
	{
		logout1.click();
	}
}

