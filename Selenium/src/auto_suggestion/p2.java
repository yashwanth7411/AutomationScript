package auto_suggestion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		sugg.stream().forEach(s->{
		if(	s.getText().contains("download"))
		s.click();
		});
	/*	for(WebElement a:sugg)
		{
			if(a.getText().contains("download"))
			{
				a.click();
				break;
			}
	/*		String text = a.getText();
			if(text.contains("download"))
			{
				a.click();
				break;
			} */
	}
}
		
