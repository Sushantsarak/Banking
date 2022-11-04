package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout2 
{
	//declare global variable
	
	@FindBy (xpath="//a[@class='remove text-xxsmall']")
	private WebElement logout2;

	//declare constructor
	
	public Logout2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// method
	
	public void logout2()
	{
		logout2.click();
	}
	
	
}
