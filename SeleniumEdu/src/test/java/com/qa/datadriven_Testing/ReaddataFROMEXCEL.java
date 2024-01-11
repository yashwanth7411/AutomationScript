package com.qa.datadriven_Testing;

import java.io.Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReaddataFROMEXCEL {
	
	WebDriver driver;
	
	Xls_Reader reader=new Xls_Reader("C:\\Users\\Admin\\eclipse-workspace\\SeleniumEdu\\src\\test\\java\\com\\qa\\datadriven_Testing\\Xls_Reader.java");
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void create_acc() throws Throwable
	{
		String fullname = reader.getCellData("sheet1", "fullname", 2);
		String rediff = reader.getCellData("sheet1", "rediff", 2);
		String pass = reader.getCellData("sheet1", "pass", 2);
		String confpass = reader.getCellData("sheet1", "confpass", 2);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]")).sendKeys(fullname);
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys(rediff);
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys(pass);
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys(confpass);
	}
	
	

}
