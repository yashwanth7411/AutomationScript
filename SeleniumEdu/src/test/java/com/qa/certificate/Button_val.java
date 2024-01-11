package com.qa.certificate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_val {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/hotels/glen-park-inn-hotel-in-ooty-2633888493605582088/?hquery={%22ci%22:%2220211228%22,%22co%22:%2220211230%22,%22r%22:%221-1-0%22,%22ibp%22:%22v15%22}&hmd=6cb508533d6ceda770e37e22983c27d5f5d6c6786da241e0330cdfd5e9088101197f445aaa3d4089ae8c31cbb4db41330b77cd896a0b357558142b6560f8a914e395974d65ebd8a487c9a91e04f503846cd5b4d3873d2cda314df9e6605f92ab8f9c4429630805b7ceef910ab92cca7f9f06bca7059548b031c2e9fd43dae6cfa0c0263cdab3fdfdb1fc55a8a62a5831ecf6458c628ff208dc3d8ce3f85c52a41777e2bea5b42d902262e9e38bc6053455927b244eb886b3d46418ecd2cabea451c1295b239b8cfacb7c135b5bb913477b10b63b774a4d73c816e83d470d203ab67bdc7d52f17ee966f05baa078c061b7a0c0f83745086302221a09165e6de96a158ec12a43a1ec81a094b720944c204fdaf2ef58e3b04dcb41ee7ffc6676a8faaa9f52b765e5df3bc889e89368352c1a90cafb6dd03d0ce7b01259ce3a1ac39decfe925f3beac2883d7c802a5230193c1cb33ec3f1ff916&cc=IN&reviewType=gi&vcid=889033689324744753&srpFilters={%22type%22:[%22Hotel%22]}");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-10 BookingWidgetstyles__ViewRoomOptionsButton-sc-1tsb1-10 KETBj iiLDmi']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'dwebCommonstyles__ButtonBase-sc-112ty3f-10 RoomFlavorstyles__ButtonWrapper')])[1]")).click();
	}

}
