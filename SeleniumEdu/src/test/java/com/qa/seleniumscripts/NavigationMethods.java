package com.qa.seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
		
		String url1 = driver.getCurrentUrl();
		System.out.println("The URL of the page"+url1);
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
		String url2 = driver.getCurrentUrl();
		System.out.println("The URL of the page"+url2);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.close();
	}

}
