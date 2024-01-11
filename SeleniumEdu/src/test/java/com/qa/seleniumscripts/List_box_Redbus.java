package com.qa.seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_box_Redbus {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Red bus webpage
		driver.get("https://www.redbus.in/bus-tickets");
		
		//Enter the From text box
		driver.findElement(By.xpath("//div[@class='D120_search_widget']/descendant::input[1]")).sendKeys("mumbai");
		Thread.sleep(5000);
		
		//select list of from text box
		List<WebElement> from = driver.findElements(By.xpath("//ul[@id='C120_suggestion-wrap']/child::*"));
		System.out.println("The number of element in FROM list: "+from.size());
		
		for(int i=0;i<from.size();i++)
		{
			String fromtext = from.get(i).getText();
			if(fromtext.contains("Vashi"))
			{
				from.get(i).click();
				break;
			}
		}
		
		// Enter to text box
		driver.findElement(By.xpath("//div[@class='D120_search_widget']/descendant::input[3]")).sendKeys("shivaji");
		Thread.sleep(5000);
		
		//list from to text box
		List<WebElement> to = driver.findElements(By.xpath("//ul[@id='C120_suggestion-wrap']/child::*"));
		System.out.println("The number of element in FROM list: "+from.size());
		
		for(int i=0;i<to.size();i++)
		{
			String totext = to.get(i).getText();
			if(totext.contains("Shivaji"))
			{
				to.get(i).click();
				break;
			}
		}
		
		//select the date Nov 5
		
		driver.findElement(By.xpath("//div[@class='D120_search_widget']/descendant::input[5]")).click();
		Thread.sleep(5000);
		
		List<WebElement> cal = driver.findElements(By.xpath("(//ul[@class='rb-calendar-days'])[2]/child::*"));
		
		for(int i=0;i<cal.size();i++)
		{
			String caltext = cal.get(i).getText();
			if(caltext.contains("5"))
			{
				cal.get(i).click();
				break;
			}
		}
	}

}
