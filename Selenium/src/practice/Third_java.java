package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third_java {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SelPgms/Html/javascrpt.html");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById('t1').value='yash'");
		Thread.sleep(2000);
		j.executeScript("document.getElementById('t1').value='wanth'");
		Thread.sleep(2000);
		driver.close();
	}

}
