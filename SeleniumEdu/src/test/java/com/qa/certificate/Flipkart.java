package com.qa.certificate;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		// CLICK ON MOBILE LINK
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//MOUSE OVER ON ELECTRONICS
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a=new Actions(driver);
		a.moveToElement(electronics).perform();
		Thread.sleep(2000);
		
		
		//CLICK ON MI OPTION
		driver.findElement(By.xpath("//a[text()='Mi']")).click();
		Thread.sleep(2000);
		
		//SELECT THE PRICE USING DROP DOWN
		
		WebElement listbox = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		 a.click(listbox).perform();
		 
		 Select s=new Select(listbox);
		 s.selectByIndex(2);
		
		 //SEARCH THE REDMI GO MOBILE IN SEARCH BAR
		 
		 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi go (black, 8 gb)");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]")).click();
		 
		 // SWITCH THE WINDOW
		 Thread.sleep(2000);
		 Set<String> allwh = driver.getWindowHandles();
		 for(String a1:allwh)
		 {
		 driver.switchTo().window(a1);		 
		 }
		 driver.findElement(By.xpath("//div[text()='View Details']")).click();
		 
		 // CLOSE ALL THE WEB PAGE
		 driver.quit();
	}

}
