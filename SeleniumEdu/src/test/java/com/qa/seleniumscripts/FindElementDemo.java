package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		driver.manage().window().maximize();
//		driver.findElement(By.id("wpName2")).sendKeys("Yash");
//		driver.findElement(By.name("wpName")).sendKeys("Yashwanth");
//		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("Sidhiksha");
		driver.findElement(By.cssSelector("#wpName2")).sendKeys("Ramya");
	}

}
