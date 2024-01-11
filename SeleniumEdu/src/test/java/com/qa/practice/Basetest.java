package com.qa.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	
	

}
