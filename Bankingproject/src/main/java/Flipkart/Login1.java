package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	//step 1: to declare global variable(data member)
	
		@FindBy (xpath="//input[@class='_2IX_2- VJZDxU']")
		private WebElement username;
		
		@FindBy (xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy (xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement loginbutton;
		
		
		//step 2: initiolization of variable
		
		public Login1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//step 3: Method creation
		
		public void enterUN() throws InterruptedException
		{
			username.sendKeys("7028109490");
		   Thread.sleep(2000);
		}
		
		public void enterPWD() throws InterruptedException
		{
			password.sendKeys("Sushant@123");
			   Thread.sleep(2000);
		}
		
		public void login() throws InterruptedException
		{
			loginbutton.click();
			Thread.sleep(3000);
		
		}
	}


