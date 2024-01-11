package com.qa.practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SelPgms/Html/javascrpt.html");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('t1').value='Y'");
		Thread.sleep(2000);
		driver.close();
				
	}

}
