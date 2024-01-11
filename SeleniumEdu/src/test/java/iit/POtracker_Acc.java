package iit;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POtracker_Acc {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Login to QA Environment
		driver.get("https://qapotracker.azurewebsites.net/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("loginfmt")).sendKeys("yk@balsambrands.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("Yash1234@");
		Thread.sleep(2000);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("KmsiCheckboxField")).click();
		WebElement yes = driver.findElement(By.id("idSIButton9"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		yes.click();
		
		//Keyboard control just to minimize
	/*	Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_MINUS);	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_MINUS);   */
		 			
		
		// Pending inventory input
		driver.findElement(By.xpath("(//a[@class='c-sidebar-nav-link'])[5]")).click();	
/*		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_MINUS);	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_MINUS);  */
		Thread.sleep(3000); 
		//click on po 22521
		driver.findElement(By.xpath("//a[text()='22541']")).click();
		
		driver.findElement(By.id("btncontinue")).click();
		driver.findElement(By.xpath("//button[text()='Review Completed']")).click();
	}
}