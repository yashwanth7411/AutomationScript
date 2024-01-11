package com.qa.wikiPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.Base.Base;

public class Homepage extends Base {
	
	//locate elements
	
	// Webelements e=driver.findelement*by.locatorname("value")
	
	// creating a object repository
	
	@FindBy(xpath="//*[@id='search-form']/descendant::input[3]")
	WebElement input;
	
	@FindBy(xpath="//*[@id='search-form']/descendant::button[1]")
	WebElement srcbtn;
	
	@FindBy(xpath="//*[@class='lang-list-button-wrapper']/descendant::span[1]")
	WebElement ReadText;
	
	//initialize the element which are located
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Action methods
	
	public void validatetitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	public String validatetext()
	{
		String text = ReadText.getText();
		System.out.println(text);
		return text;
	}
	
	public void searchinput(String i1) throws Throwable
	{
		input.clear();
		input.sendKeys(i1);
		Thread.sleep(2000);
		srcbtn.click();
	}

}
