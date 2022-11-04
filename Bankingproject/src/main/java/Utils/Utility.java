package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Utility {

	//step 1: to declare global variable(data member)
	
			@FindBy (xpath="//input[@class='_2IX_2- VJZDxU']")
			private WebElement username;
			
			@FindBy (xpath="//input[@type='password']")
			private WebElement password;
			
			@FindBy (xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
			private WebElement loginbutton;
			// step2 initialization of variable
			//public Login 1(WebDriver driver) {
				//PageFactory.initElements(driver, this);
				
			}
	
	
	
	

