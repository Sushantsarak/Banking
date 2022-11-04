package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fliplogout1 {
	@FindBy (xpath="//div[@class='go_DOp'][1]")
	private WebElement myaccount; 

	@FindBy (xpath="//div[text()='Logout']")
	private WebElement logoutflip;
	
	
	public Fliplogout1(WebDriver driver) 
		
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void myaccount(WebDriver driver) throws InterruptedException
	{
		Actions x = new Actions(driver);
		x.moveToElement(myaccount).contextClick().perform();
		  Thread.sleep(2000);
		  x.moveToElement(logoutflip).click().build().perform();
	}
	
}

