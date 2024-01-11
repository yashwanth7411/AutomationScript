package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		// Links -- linkText() locators
		
		// switch to frame and inspect the web element
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ChromiumDriver")).click();
	}

}
