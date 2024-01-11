package com.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	@Test(priority=4)
	public void fb()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("yash");
		driver.findElement(By.id("pass")).sendKeys("wanth");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.close();
		
	}

}
