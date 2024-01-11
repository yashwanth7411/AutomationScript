package com.qa.certificate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		// CLICK ON SUBMIT BUTTON
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		// VERIFY BACKGROUND COLOR
		String bc = login.getCssValue("background-color");
		System.out.println(bc);
		//CLICK ON FORGOTTEN PWD BUTTON
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		// VERIFY EMAIL BACKGROUND COLOR
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		String color = email.getCssValue("background-color");
		System.out.println(color);
		//CLICK ON FORGOTTEN PWD
		WebElement loginbtn = driver.findElement(By.xpath("(//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 pfnyh3mw i1fnvgqd bp9cbjyn owycx6da btwxx1t3 b5q2rw42 lq239pai mysgfdmx hddg9phg'])[2]"));
		System.out.println(loginbtn.isEnabled());
		
		
		// VERIFY THE URL 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		url.contains("facebook");
		
		driver.findElement(By.cssSelector("a[class='oajrlxb2 g5ia77u1 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 nc684nl6 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso i1ao9s8h esuyzwwr f1sip0of lzcic4wl py34i1dx gpro0wi8']")).click();
		// ENTER THE PHONE NUMBER AND SEE THE ERROR MESSAGE
		Set<String> allwh = driver.getWindowHandles();
		for(String a:allwh)
		{
			driver.switchTo().window(a);
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("12345678");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button#did_submit")).click();
		}
	}

}
