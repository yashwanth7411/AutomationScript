package com.wiki.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wikiPages.Homepage;

public class HomePageTest extends Base{
	
	 Homepage hp;
 
	 @BeforeClass
	 public void startbrowser()
	 {
		 initialize();
		 hp = new Homepage();
	 }
 
	 	@Test
	 		public void ValidateTitleTest()
	 		{
	 			hp.validatetitle();
  
	 		}
 
	 		@Test
	 		public void validateTextTest()
	 		{
	 			String expText="Read Wikipedia in your language";
	 			String actualtext = hp.validatetext();
	 			Assert.assertEquals(actualtext, expText,"text do not match");
	 		}
 
	 		@Test
	 		public void searchInputTest() throws Throwable
	 		{
	 			hp.searchinput("SeleniumTesting");
	 		}
	 		
	 		@Test
	 		public void closebrowser()
	 		{
	 			driver.close();
	 		}
	}
