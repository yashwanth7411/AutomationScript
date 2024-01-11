package com.qa.practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException, Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		System.out.println(title);
		TakesScreenshot t= (TakesScreenshot) driver;
		File src= t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+title+".png");
		FileUtils.copyFileToDirectory(src, dest);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("actitime"));
		
		
	}

}
