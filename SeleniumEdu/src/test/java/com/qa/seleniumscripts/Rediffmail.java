package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffmail {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		boolean flag=false;
		
		// Verify full name
		if(driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]")).isEnabled())
		{
			flag=true;
			System.out.println("Full Name is enabled");
		}
		else
		{
			System.out.println("Full Name is not enabled");
		}
		
		//Verify Rediff mail ID
		if(driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).isEnabled())
		{
			flag=true;
			System.out.println("Rediff Id is enabled");
		}
		else
		{
			System.out.println("Rediff Id is enabled");
		}
		
		//Verify check availability
		if(driver.findElement(By.xpath("//input[starts-with(@name ,'btnchk')]")).isEnabled())
		{
			flag=true;
			System.out.println("Check availability btn is enabled");
		}
		else
		{
			System.out.println("Check availability btn is not enabled");
			
		}
		
		//Verifying password is enabled
		if(driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).isEnabled())
		{
			flag = true;
			System.out.println("Password is enabled");
		}
		else
		{
			System.out.println("Password is not enabled");
		}		

//Verifying confirm password is enabled
		if(driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).isEnabled())
		{
			flag = true;
			System.out.println("Confirm Password is enabled");
		}
		else
		{
			System.out.println("Confirm Password is not enabled");
		}			
		
//Verifying Alternate email text is enabled
		if(driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).isEnabled())
		{
			flag = true;
			System.out.println("Alternate email is enabled");
		}
		else
		{
			System.out.println("Alternate email is not enabled");
		}					
		
		//Verify the DOB
		WebElement d = driver.findElement(By.xpath("//select[starts-with(@name ,'DOB_Day')]"));
		Select s=new Select(d);
		
		WebElement m = driver.findElement(By.xpath("//select[starts-with(@name ,'DOB_Month')]"));
		Select s1=new Select(m);
		
		WebElement y = driver.findElement(By.xpath("//select[starts-with(@name ,'DOB_Year')]"));
		Select s2=new Select(y);
		
		//gender
		driver.findElement(By.xpath("(//input[starts-with(@name ,'gender')])[1]")).click();
		
		//Country
		WebElement country = driver.findElement(By.xpath("(//select[starts-with(@name ,'country')])[1]"));
		Select s3=new Select(country);
		s3.selectByValue("99");
		
		
		//Enter Inputs
		driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]")).sendKeys("Yashwanth");
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys("Yashwanth.2021");
		driver.findElement(By.xpath("//input[starts-with(@name ,'btnchk')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys("Yash7411");
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys("Yash7411");
		driver.findElement(By.xpath("//input[starts-with(@name ,'altemail')]")).sendKeys("Yashyash@gmail.com");
		s.selectByValue("01");
		Thread.sleep(2000);
		s1.selectByValue("02");
		Thread.sleep(2000);
		s2.selectByValue("2020");
	}

}
