package iit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import Programs.BasePO;

public class POtracker_ops extends BasePO{
	@Test
	public void ops() throws Throwable {
		driver.findElement(By.xpath("(//a[@class='c-sidebar-nav-link'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='6376']")).click();
		WebElement list_box = driver.findElement(By.id("shipmentName"));
		Select s=new Select(list_box);
		s.selectByValue("1");
		driver.findElement(By.xpath("//input[@class='form-control form-control-sm hblNumber']")).sendKeys("FLEX7145906");
		driver.findElement(By.xpath("//input[@class='form-control form-control-sm trackingID']")).sendKeys("28905645");	
		driver.findElement(By.xpath("(//button[contains(text(),'Next')])[1]")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//button[text()='Submit for Review']")).click();	
	}
}
