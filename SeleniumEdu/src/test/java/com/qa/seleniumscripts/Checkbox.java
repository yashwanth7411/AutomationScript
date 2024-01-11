package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		// get()  ---- work as index to select the list of elements
		boolean beforeclick = driver.findElements(By.xpath("//input[@type='checkbox']")).get(0).isSelected();
		System.out.println(beforeclick);
		
		driver.findElements(By.xpath("//input[@type='checkbox']")).get(0).click();
		
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(1).click();
		
		Thread.sleep(2000);
		driver.findElements(By.xpath("//input[@type='checkbox']")).get(4).click();
		
		boolean sel = driver.findElements(By.xpath("//input[@type='checkbox']")).get(4).isSelected();
		System.out.println(sel);
		
		
		
			driver.close();
	}

}
