package com.qa.seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox_searchbar {

	public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	
	driver.findElement(By.xpath("//*[@id='yschsp']")).sendKeys("appium");
	Thread.sleep(5000);
	
	//capture the entire list
	
	List<WebElement> listbox = driver.findElements(By.xpath("//*[@role='listbox']/child::*"));
	
	System.out.println("The number of elements in the list: "+listbox.size());
	
	for(int i=0;i<listbox.size();i++)
	{
		String text = listbox.get(i).getText();
		if(text.contains("download"))
		{
			listbox.get(i).click();
			break;
		}
	}
	driver.close();
	

	}

}
