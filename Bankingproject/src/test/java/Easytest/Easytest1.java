package Easytest;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import EasyMytrip.HomeEasy;

public class Easytest1 {
	WebDriver driver;
	HomeEasy homeasy;

	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sushant\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
        
		//driver = new ChromeDriver();
		homeasy = new HomeEasy(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/flights.html");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
		
	}

	@Test
	public void test1() throws InterruptedException {
		System.out.println("test1");
		homeasy.flights();
		Thread.sleep(3000);
		String actualUrl = driver.getCurrentUrl();
		String expeUrl="https://www.easemytrip.com/flights.html";
		Assert.assertEquals(actualUrl, expeUrl);
		
	}
     @ Test
     public void test2() throws InterruptedException {
    	System.out.println("test2");
    	 homeasy.flho();	 
    	 Thread.sleep(4000);
     String actualurl = driver.getCurrentUrl();
       String expectedUrl="https://fph.easemytrip.com/";
       Assert.assertEquals(actualurl, expectedUrl);
     }
	@ Test 
	public void test3() throws InterruptedException {
		System.out.println("test3");
		homeasy.trains();
	Thread.sleep(4000);
	String actualUrl = driver.getCurrentUrl();
	  String ExpctUrl ="https://www.easemytrip.com/railways/";
	  Assert.assertEquals(actualUrl, ExpctUrl);
	
	
	}
	@ Test 
	public void test4() throws InterruptedException {
		System.out.println("test4");
		homeasy.bus();
		Thread.sleep(4000);
	   String actualurl = driver.getCurrentUrl();
	   String Expecteddurl ="https://www.easemytrip.com/bus/";
	   Assert.assertEquals(actualurl, Expecteddurl);
	   
	}
	@AfterMethod
	public void aftermethod() throws InterruptedException{
		System.out.println("after method");
	Thread.sleep(4000);
	}
	
	@ AfterClass
	public void closetab() throws InterruptedException {
		System.out.println("afterclass");
	Thread.sleep(2000);
		driver.close();
	}
	
	
	
}
