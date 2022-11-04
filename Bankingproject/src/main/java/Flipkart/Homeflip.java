package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeflip {

	

	 
	
		//declare global variable
		
		@FindBy (xpath="//img[@alt='Top Offers']")
		private WebElement topoffers;
		
		@FindBy (xpath="//img[@alt='Mobiles & Tablets']")
		private WebElement mobtablet;
		
		@FindBy (xpath="//img[@alt='Electronics']")
		private WebElement electronics;
		
		@FindBy (xpath="//img[@alt='TVs & Appliances']")
		private WebElement tv;
		
		@FindBy (xpath="//img[@alt='Beauty']")
		private WebElement beauty;
		
		//initiolization of variable
		
		public Homeflip(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//method create
		
		public void topoffers()
		{
			topoffers.click();
		}
		public void mobtablet()
		{
			mobtablet.click();
		}
		public void electronics() 
		{
			electronics.click();
		}
		public void tv() 
		{
			tv.click();
		}
		public void beauty() 
		{
			beauty.click();
		}
		
	}

	
	
	
	
	

