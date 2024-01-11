package com.qa.practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test4 extends Basetest{
	@Test
	public void actitime()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

}
