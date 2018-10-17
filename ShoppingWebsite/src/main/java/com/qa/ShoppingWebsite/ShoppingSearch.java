package com.qa.ShoppingWebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingSearch 

{
	
	String text;
	
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	WebElement search_dress;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	WebElement search_button;
	
	
	public String get_input() 
	{
		return text;
	}
	
	
	public void search (String UserInput) 
	{
		this.text = UserInput;
		search_dress.sendKeys(UserInput);
		search_button.submit();
	}

}
