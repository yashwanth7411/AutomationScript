package pack1;


import java.util.List;

import org.openqa.selenium.By;
//independent and dependent for flipkart less than 2000
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p13
{

	public static void main(String[] args) throws InterruptedException
	{
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.flipkart.com");
		//closes the pop up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//sends data to search box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("woodland shoes");
		//clicks on seach box
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//pause the page for 2sec
		Thread.sleep(2000);
		 List<WebElement> title = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		  List<WebElement> price = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));
		  
		 for(int i=0;i<title.size();i++)
		 {
			 String s1= price.get(i).getText().substring(1).replace(",", "");
			 int p=Integer.parseInt(s1);
			 if(p<=2000)
			 {
			 System.out.println("title "+title.get(i).getText()+"price "+price.get(i).getText());
			 }
		 }
	}
	
}