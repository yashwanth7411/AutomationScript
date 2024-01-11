package com.qa.practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test5 extends Basetest{
	@Test
	public void fb()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("yash");
		driver.findElement(By.id("pass")).sendKeys("wanth");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
	}

}
