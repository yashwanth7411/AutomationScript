package com.qa.wikiPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.Base.Base;

public class SearchPage extends Base{
	
	@FindBy(xpath="//*[@id='powersearch']/descendant::input[1]")
	WebElement inputbox;
	
	@FindBy(xpath="//*[@id='powersearch']/descendant::button[1]")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id='powersearch']/descendant::span[12]")
	WebElement dd;
	
	@FindBy(xpath="//*[@id='powersearch']/descendant::span[15]")
	WebElement advanceinput;
	
	@FindBy(linkText="Main Page")
	WebElement mainpage;
	
	public void searchpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validatetitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
		
	
	 public void searchResults(String input1,String input2) throws InterruptedException
	 {
	  inputbox.clear();
	  Thread.sleep(1500);
	  inputbox.sendKeys(input1);
	  dd.click();
	  Thread.sleep(2000);
	  advanceinput.clear();
	  advanceinput.sendKeys(input2);
	  Thread.sleep(1000);
	  searchbtn.click();
	  Thread.sleep(2000);
	  
	 }
	 
	 public MainPage MainPageLinkClick()
	 {
	  String text= mainpage.getText();
	  System.out.println("the text of the link is: "+ text);
	  mainpage.click();
	  return new MainPage();
	 }
	
	

}
