package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Zerodha.Home;
import Zerodha.Login;
import Zerodha.Login2;
import Zerodha.Logout1;
import Zerodha.Logout2;

public class Testclass {
	WebDriver driver;
	Login login;
	Login2 login2;
	Home home;
	Logout2 logout2;
	Logout1 logout1;
	@Parameters("browser")

	@BeforeTest
	
	public void openbrowser(String browserName) {
			 System.out.println(browserName);
			 if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushant\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
			 }

			
			  if (browserName.equals("firefox")) {
	 System.setProperty("webdriver.gecko.driver",
			  "C:\\Users\\Sushant\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); 
			  driver =new FirefoxDriver();
			  }
			  driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

				driver.get("https://kite.zerodha.com/");
			
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void beforemethod() throws InterruptedException {

		login = new Login(driver);
		login.enterUN();
		login.enterPWD();
		login.login();

		login2 = new Login2(driver);
		Thread.sleep(2000);
		login2.enterpin();
		login2.clicksubmit();
		home = new Home(driver);

		logout1 = new Logout1(driver);
		logout2 = new Logout2(driver);
	}

	@Test
	public void test1() {

		home.orders();
	}

	@Test
	public void test2() {
		home.Funds();
	}

	@Test
	public void test3() {
		home.Holdings();
	}

	@Test
	public void test4() {
		home.Apps();
	}

	@Test
	public void test5() {
		home.Positions();
	}

	@AfterMethod

	public void afterMethod() {

		logout1.accountswitch();
		logout1.logout1();

		logout2.logout2();

	}

	@AfterClass

	public void closetab() {

		driver.close();
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	 System.gc();
	}
}
