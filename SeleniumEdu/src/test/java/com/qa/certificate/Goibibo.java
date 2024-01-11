package com.qa.certificate;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// go to goibibo webpage
		driver.get("https://www.goibibo.com/");
		// click on hotels
		driver.findElement(By.xpath("//ul[@class='happy-nav']/child::*[2]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'HomePage')]")).sendKeys("ooty");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("downshift-1-item-0")).click();
		
		// check in and check out
		driver.findElement(By.xpath("(//div[contains(@class,'dwebCommonstyles__CenteredSpaceWrap')])[1]/child::div[1]")).click();
		driver.findElement(By.xpath("(//span[text()='28'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='30'])[1]")).click();
		
		//select the adult room and click on search hotels
		driver.findElement(By.xpath("//div[@class='SearchBlockUIstyles__PaxCountWrap-sc-fity7j-9 heYAZX']")).click();
		driver.findElement(By.xpath("(//span['PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[18]")).click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		driver.findElement(By.xpath("//button[text()='Search Hotels']")).click();
		
		
		//search total and select if match
	/*	List<WebElement> hotels = driver.findElements(By.xpath("//span[text()='Hotel']"));
		for(WebElement a:hotels)
		{
			System.out.println(a.getText());
		}  */
		
		// Search the hotel and select Glen park Inn hotel
		driver.findElement(By.xpath("//span[text()='Hotel']/../..")).click();
		Thread.sleep(3000);
		List<WebElement> hotels = driver.findElements(By.xpath("//div[@class='HotelCardstyles__HeadingInfoWrapperDiv-sc-1s80tyk-13 hZkcMT']/child::div[@class='HotelCardstyles__HotelNameWrapperDiv-sc-1s80tyk-15 htvOTn']"));
		for(WebElement a:hotels)
		{
			String names = a.getText();
			System.out.println(names);
			if(names.contains("Glen Park Inn"))
			{
				a.click();
			}
			else
				break;
		}
		
		// TO VERIFY THE WINDOW HANDLE 
	/*	System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Results")); 
		System.out.println(driver.getTitle()); */
		
		 // SWITCH THE ACCESS TO SECOND WINDOW
		 Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);  
		for(String a:allwh)
		{
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
		}
	//	WebDriverWait wait=new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-10 BookingWidgetstyles__ViewRoomOptionsButton-sc-1tsb1-10 KETBj iiLDmi']"))).click();
		driver.findElement(By.xpath("//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-10 BookingWidgetstyles__ViewRoomOptionsButton-sc-1tsb1-10 KETBj iiLDmi']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'dwebCommonstyles__ButtonBase-sc-112ty3f-10 RoomFlavorstyles__ButtonWrapper')])[1]")).click();
		
		
		//ENTER GUEST DETAILS
				
		driver.findElement(By.xpath("(//input[contains(@class,'PersonalProfile__NameEnterInput')])[1]")).sendKeys("Yash");
		driver.findElement(By.xpath("(//input[contains(@class,'PersonalProfile__NameEnterInput')])[2]")).sendKeys("wanth");
		driver.findElement(By.xpath("//input[@class='PersonalProfile__MobileEnterInput-sc-1r9ak8b-8 fBxMec']")).sendKeys("Yash@gmail.com");
		driver.findElement(By.xpath(" //input[@type='number']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//span[text()='Proceed To Payment Options']")).click();
		
		Thread.sleep(2000);
		//ENTER CARD DETAILS
		driver.findElement(By.xpath("//input[@class='form-control inputMedium cr_crd_no']")).sendKeys("4288 9123 5678 1991 010");
		driver.findElement(By.xpath("(//input[@name='ccname'])[1]")).sendKeys("Yash");
		driver.findElement(By.xpath("(//input[@name='cardExpiry'])[1]")).sendKeys("12","22");
		driver.findElement(By.xpath("(//input[@name='cardCVV'])[1]")).sendKeys("365");
		driver.quit();
	}
}
