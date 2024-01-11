package com.qa.seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		//Locate the select box
		WebElement e1 = driver.findElement(By.xpath("//select[@name='coffee']"));
		
		//Select is a class in the selenium that has methods that can select items in drop down
		
		Select s=new Select(e1);
		
		s.selectByValue("regular");
		Thread.sleep(2000);
		s.selectByValue("crisp");
		
		//Select by index
		Thread.sleep(2000);
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		s.selectByVisibleText("With sugar");
		
		//fetch all the list of webelements options
		List<WebElement> li = s.getOptions();
		System.out.println(li.size());
		
		// for each loop to print the list 
		
		for(WebElement all:li)
		{
			System.out.println(all.getText());
		}
		

	}

}
