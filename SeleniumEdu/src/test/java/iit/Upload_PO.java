package iit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//import Programs.BasePO;

public class Upload_PO extends BasePO {
	@Test
	public void upload() throws Throwable
	{
		driver.findElement(By.xpath("(//a[@class='c-sidebar-nav-link'])[2]")).click();
		WebElement Upload = driver.findElement(By.id("UploadedFile"));
		Actions a=new Actions(driver);
		a.click(Upload).perform();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("./upload/pop.exe");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
}
