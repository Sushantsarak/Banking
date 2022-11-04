	package Zerodha;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class Login2 
	{
		//declare globalvariable
		//@FindBy (xpath="//input[@type='password']")
		//private WebElement pin;
		@FindBy (xpath="//input[@type='text']")
		private WebElement appcode;
		
		
		
		@FindBy (xpath="//button[@type='submit']")
		private WebElement submit;
		
		//initialize variable
		public Login2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//method create
		
		public void enterpin() throws InterruptedException 
		{
			appcode.sendKeys("200800");
			   Thread.sleep(2000);
		}
		
		public void clicksubmit() throws InterruptedException
		{
			submit.click();
			   Thread.sleep(2000);
		}
	}
