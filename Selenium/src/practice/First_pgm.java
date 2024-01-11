package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_pgm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Y@234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("yash@gmail.com");
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		driver.close();
	}

}
