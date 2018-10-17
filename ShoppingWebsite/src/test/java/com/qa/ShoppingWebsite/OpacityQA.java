package com.qa.ShoppingWebsite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpacityQA 


{
	public WebDriver driver = null;
	
	@Before
	public void before() 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shafeeq\"]/h2"))); 
		
		myDynamicElement.getText();
		
		assertEquals("-The Shafeeq",myDynamicElement.getText());

	}
	
	@After
	public void after()
	{
		driver.quit();
	}
	

}
