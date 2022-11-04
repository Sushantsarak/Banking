package educationdomain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Elerning.Education;
import Zerodha.Login;

public class Testeducation {
	WebDriver driver;
	Education education;
	Login login;

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sushant\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.khanacademy.org/");
	}

	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		System.out.println("before method");
		education = new Education(driver);
		education.login();
		Thread.sleep(5000);
		education.username();
		education.password();
		education.loginclick();
		
		
	}

	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test1");
		Thread.sleep(2000);
		education.cources();
		Thread.sleep(2000);
		education.class1();
       Thread.sleep(2000);
		education.small();
		Thread.sleep(5000);
		education.clicktryagain();  
//org.openqa.selenium.ElementClickInterceptedException
		
	}

	

	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class");

	}

}
