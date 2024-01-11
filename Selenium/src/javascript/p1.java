package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SelPgms/Html/javascrpt.html");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById('t1').value='Yash'");
	}

}