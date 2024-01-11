package com.qa.seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		// maximize your browsing window
		driver.manage().window().maximize();
		
		//add wait 
		Thread.sleep(2000);
		
		//to close the driver
		driver.close();
		
	}

}
