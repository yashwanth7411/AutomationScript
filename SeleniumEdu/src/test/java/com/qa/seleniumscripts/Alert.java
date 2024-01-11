package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 WebElement e1 = driver.findElement(By.xpath("//input[@type='submit']"));
		e1.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert a =driver.switchTo().alert();
		a.accept();
		driver.close();

	}

}
