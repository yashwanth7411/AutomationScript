package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	
	@Test
	public void validate()
	{
		String actual="SeleniumTraining";
		String expected ="SeleniumTraining";
		// Hard Assert
		
		Assert.assertEquals(actual, expected," The String Does not matched");
		
		System.out.println(expected);
		System.out.println(actual);
		
	}
	
	
	
	@Test
	public void validateTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle = driver.getTitle();
		
		driver.findElement(By.id("gh-ac")).sendKeys("toys");
		driver.findElement(By.id("gh-btn")).click();
		}

}
