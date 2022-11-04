package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Facebook.Facelog;

public class TestFb {
	WebDriver driver;
	Facelog login;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sushant\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	}
	        @BeforeMethod
	        public void beforemethod()
	        {
	        login = new Facelog(driver);
	        login.EnterUn();
	        login.EnterPw();
	        login.Loginbt();
	        
	        
	        }	
	        	
	        	
	        }
	
	
	
	
	
	
	

