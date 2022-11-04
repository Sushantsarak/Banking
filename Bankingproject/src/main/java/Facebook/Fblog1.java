package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblog1 {

	@FindBy (xpath="")
	private WebElement logout1;
	
	
	public Fblog1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
}
