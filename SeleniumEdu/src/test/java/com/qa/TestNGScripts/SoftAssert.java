package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void validatitle() throws Throwable
	{
		SoftAssert sa =new SoftAssert();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle = driver.getTitle();
		
		driver.findElement(By.id("gh-ac")).sendKeys("toys");
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("advanced")).click();
		String actual2=driver.getTitle();
		
	}

}
