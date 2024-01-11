package com.qa.practice;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Node_hub {
	public static void main(String[] args) throws Throwable {
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setPlatform(Platform.WINDOWS);
	cap.setBrowserName("chrome");
	ChromeOptions opt=new ChromeOptions();
	opt.merge(cap);
	String url = "http://192.168.29.91:4545/wd/hub";
	
	WebDriver driver=new RemoteWebDriver(new URL(url), opt);
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
	
	}
}
