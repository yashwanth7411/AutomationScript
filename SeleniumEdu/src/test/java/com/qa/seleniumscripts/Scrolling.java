package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	
	// to fing radio btn
	WebElement e1 = driver.findElement(By.xpath("(//blockquote[@class='Example'])[2]/descendant::input[1]"));
	WebElement e2 = driver.findElement(By.xpath("(//blockquote[@class='Example'])[2]/descendant::input[2]"));
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("arguments[1].scrollIntoView(true)", e1,e2);
	
	Thread.sleep(2000);
	
	e2.click();
	

	}

}
