package com.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {
	public WebDriver driver;
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Suite is starting");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Suite is ended");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		driver=new ChromeDriver();
	}
	
	@Test(priority=5)
	public void actitime() throws Throwable
	{
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}
}
