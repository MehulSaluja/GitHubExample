package com.qa.MousePositionName;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

//import junit.framework.TestCase;

public class NameMouseTest

{
	public WebDriver driver = null;
	Actions act;
	
	@Before
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		act = new Actions(driver);
	}
	
	@Test
	public void searchText () throws InterruptedException, IOException 
	{
		driver.get("https://www.youidraw.com/apps/painter/");
		
		
		act.clickAndHold();
        act.moveByOffset(200,400).clickAndHold().moveByOffset(0, -200).release().perform();
        act.clickAndHold().moveByOffset(40, 150).release().perform();
        act.clickAndHold().moveByOffset(40, -150).release().perform();
        act.clickAndHold().moveByOffset(0, 200).release().perform();
        
        act.release().moveByOffset(40,0);
        
        act.clickAndHold().moveByOffset(0, -200).release().perform();
        act.clickAndHold().moveByOffset(150, 0).release().perform();
        act.clickAndHold().moveByOffset(-150, 0).release().perform();
        act.clickAndHold().moveByOffset(0, 100).release().perform();
        act.clickAndHold().moveByOffset(150, 0).release().perform();
        act.clickAndHold().moveByOffset(-150, 0).release().perform();
        act.clickAndHold().moveByOffset(0, 200).release().perform();
        act.clickAndHold().moveByOffset(150, 0).release().perform();
        
        
        
      

        
        
       
	}
	
	@After
	public void tearDown() 
	{
	//	driver.quit();
		
		
	}
	
	
	
	
	

}
