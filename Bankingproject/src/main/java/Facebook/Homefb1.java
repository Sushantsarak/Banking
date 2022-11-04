package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homefb1 {
	//declare global variable
	
		@FindBy (xpath="//div[@tabindex='0'][2]")
		private WebElement menue ;
		
		@FindBy (xpath="//input[@aria-expanded='true']")
		private WebElement recentserch;
		//initiolization of variable
		
		public Homefb1(WebDriver driver)
		{

		PageFactory.initElements(driver, this);
		}
		
		//method create
		
		public void menue()
		{
			menue.click();
		}
		public void recentserch()
		{
		    recentserch.click();
		}

	
	
	
	
	
	
	
}
