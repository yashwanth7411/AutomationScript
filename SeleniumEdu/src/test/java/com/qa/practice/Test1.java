package com.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	
	@Test
	public void actitime() throws Throwable
	{
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test
	public void fb()
	{
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("yash");
		driver.findElement(By.id("pass")).sendKeys("wanth");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
	}

}
