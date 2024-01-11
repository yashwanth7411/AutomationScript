package com.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void link()
	{
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		
		SoftAssert s=new SoftAssert();
	//	Assert.assertFalse(link.isDisplayed());
		s.assertFalse(link.isDisplayed());
		System.out.println("Link is passed");
		driver.close();
		s.assertAll();
		System.out.println("Link verification");
		
	}

}
