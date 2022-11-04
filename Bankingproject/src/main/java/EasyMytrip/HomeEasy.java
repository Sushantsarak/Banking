package EasyMytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeEasy {

	// to declare the global variable
	@FindBy(xpath = "(//a[@href='https://www.easemytrip.com/flights.html'])[1]")
	private WebElement flights;
	
	@FindBy(xpath = "(//a[@href='https://fph.easemytrip.com/'])")
	private WebElement flho;
	@FindBy(xpath = "//a[@href='https://www.easemytrip.com/railways']")
	private WebElement trains;
	@FindBy(xpath = "(//a[@href='https://www.easemytrip.com/bus/'])[1]")
	private WebElement bus;

	// initialization of variables
	public HomeEasy(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//method creation
	public void flights() {
		flights.click();
	}

	public void flho() {
		flho.click();
	}

	public void trains() {
		trains.click();
	}

	public void bus() {
		bus.click();
	}

}
