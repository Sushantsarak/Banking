package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	//declare global variable
	
	@FindBy (xpath="//span[text()='Orders']")
	private WebElement orders;
	
	@FindBy (xpath="//span[text()='Holdings']")
	private WebElement holdings;
	
	@FindBy (xpath="//span[text()='Positions']")
	private WebElement positions;
	
	@FindBy (xpath="//span[text()='Funds']")
	private WebElement funds;
	
	@FindBy (xpath="//span[text()='Apps']")
	private WebElement apps;
	
	//initiolization of variable
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//method create
	
	public void orders()
	{
		orders.click();
	}
	public void Holdings()
	{
		holdings.click();
	}
	public void Positions() 
	{
		positions.click();
	}
	public void Funds() 
	{
		funds.click();
	}
	public void Apps() 
	{
		apps.click();
	}
	
}
