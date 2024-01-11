package com.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	@Test
	public void chk_selected()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		
		SoftAssert s=new SoftAssert();
		s.assertFalse(checkbox.isSelected());
	//	org.testng.Assert.assertEquals(checkbox.isSelected(),true);
	//	org.testng.Assert.assertFalse(checkbox.isSelected());
		System.out.println(1);
		driver.close();
		s.assertAll();
	}
}
