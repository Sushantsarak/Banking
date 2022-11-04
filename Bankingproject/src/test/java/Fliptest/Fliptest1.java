package Fliptest;

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

import Flipkart.Fliplogout1;
import Flipkart.Homeflip;
import Flipkart.Login1;
import Zerodha.Home;
import Zerodha.Logout1;

public class Fliptest1 {

	WebDriver driver;
	Login1 login1;
	Homeflip homeflip;
	Fliplogout1 fliplogout1;

	@Parameters("browser")

	@BeforeTest

	public void openbrowser(String browserName) {
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sushant\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
		}

		if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Sushant\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");

	}

	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		System.out.println("Before method");
		login1 = new Login1(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.login();

		homeflip = new Homeflip(driver);
		fliplogout1 = new Fliplogout1(driver);
	}

	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test1");
		homeflip.topoffers();
		Thread.sleep(2000);
		String actualUrl = driver.getCurrentUrl();

	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2");
		homeflip.mobtablet();
		Thread.sleep(2000);
	}

	@Test
	public void test3() throws InterruptedException {
		System.out.println("Test3");
		homeflip.electronics();
		Thread.sleep(2000);
	}

	@Test
	public void test4() throws InterruptedException {
		System.out.println("Test4");
		homeflip.tv();
		Thread.sleep(2000);
	}

	@Test
	public void test5() throws InterruptedException {
		System.out.println("Test5");
		homeflip.beauty();
		Thread.sleep(2000);
	}

	@AfterMethod

	public void afterMethod() throws InterruptedException {
		System.out.println("After method");
		fliplogout1.myaccount(driver);

	}

	@AfterClass

	public void closetab() {
		System.out.println("After class");
		driver.close();
		driver = null;
		login1 = null;
		homeflip = null;
		fliplogout1 = null;
	}

	@AfterTest
	public void aftertest()  {
		System.out.println("after test");
		System.gc();
	}
}
