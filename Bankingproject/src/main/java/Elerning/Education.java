package Elerning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Education {
	// to declare global variable
	@FindBy(xpath = "//a[@class='_282h9ya'][1]")
	private WebElement login;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginclick;

	@FindBy(xpath = "//span[@data-learn-menu-trigger='true']")
	private WebElement cources;

	@FindBy(xpath = "//span[text()='Class 1']")
	private WebElement class1;

	@FindBy(xpath = "//a[@aria-label='Counting small numbers']")
	private WebElement small;

	@FindBy(xpath = "//span[text()='Count with small numbers']")
	private WebElement tryagain;

	// initialization of variables
	public Education(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// method creation
	public void login() {
		login.click();
	}

	public void username() {
		username.sendKeys("Sushantsarak20@gmail.com");
	}

	public void password() {
		password.sendKeys("Sushant@1234");
	}

	public void loginclick() {
		loginclick.click();
	}

	public void cources() {
		cources.click();
	}

	public void class1() {
		class1.click();
	}

	public void small() {
		small.click();
	}
	public void clicktryagain() {
		tryagain.click();
	}
	
	
	
	
	
}
