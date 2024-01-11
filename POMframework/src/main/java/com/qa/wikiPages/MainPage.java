package com.qa.wikiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver driver;
	@FindBy(linkText="encyclopedia")
	WebElement en;
	
	@FindBy(linkText="Log in")
	WebElement login;
	
	public MainPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	

}
