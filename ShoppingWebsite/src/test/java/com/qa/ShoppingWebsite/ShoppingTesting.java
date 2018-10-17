package com.qa.ShoppingWebsite;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import com.qa.ShoppingWebsite.AfterClickingSave;
//import com.qa.ShoppingWebsite.User;

public class ShoppingTesting


{
	public WebDriver driver = null;
	Constants con = new Constants();
	
	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\ReportsWeek7\\name.html", true);
	ExtentTest test;
	
	@Before
	public void setup() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void createuser() throws Exception
	{
		test = extent.startTest("Verify App");
		test.log(LogStatus.INFO, "Started Test");
		
		
		driver.get("http://automationpractice.com/index.php");	
		
		ShoppingSearch search = PageFactory.initElements(driver,ShoppingSearch.class);
		search.search("dress");
		
		assertEquals("dress",search.get_input());
		
		if (search.get_input().equals("dress")) 
		{
			test.log(LogStatus.PASS, "dress found");
		}
		
		else 
		{
			test.log(LogStatus.FAIL, "dress not found");
		}
	}
	
	@AfterClass
	
	public static void end() 
	{
		extent.flush();
	}
	

}
