package com.qa.seleniumscripts;

public class FirefoxDemo extends Base {

	public static void main(String[] args) throws Throwable {
		openbrowser();
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
