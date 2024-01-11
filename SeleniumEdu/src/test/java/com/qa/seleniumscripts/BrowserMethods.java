package com.qa.seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	public static void main(String[] args) {
		
		//start browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// delete cookies
		driver.manage().deleteAllCookies();
		
		//Load the webpage on the current browser
		driver.get("https://www.wikipedia.org/");
		
		String actualTitle = driver.getTitle();
		System.out.println("The actual title: "+actualTitle);
		
		String expectedTitle="Wikipedia";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is matching");
		}
		else
			System.out.println("Title is not matching");
		
		driver.close();
		
	}

}
