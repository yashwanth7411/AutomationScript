package practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chatgpt_demo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys("chatgptdemo");
	//	Robot r =new Robot();
	//	r.keyPress(KeyEvent.VK_ENTER);
	//	r.keyRelease(KeyEvent.VK_ENTER);
	}
}
