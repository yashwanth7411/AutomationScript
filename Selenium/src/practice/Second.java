package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=clock+time&rlz=1C1JJTC_enIN989IN989&sxsrf=ALiCzsZDbwxvVaEvpUeWfhiXnAvAzaqV1Q%3A1669184612328&ei=ZLx9Y-LcE7Lg0PEP-LiMuAc&ved=0ahUKEwjinoef1cP7AhUyMDQIHXgcA3cQ4dUDCA8&uact=5&oq=clock+time&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIECCMQJzIECAAQQzIICAAQgAQQsQMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMggIABCABBDJAzIFCAAQgAQyBQgAEIAEOgoIABBHENYEELADOgcIABCwAxBDSgQIQRgASgQIRhgAUMQFWMQFYOwHaAFwAXgAgAGZAogBmQKSAQMyLTGYAQCgAQHIAQrAAQE&sclient=gws-wiz-serp");
		WebElement current_time = driver.findElement(By.xpath("//span[contains(text(),' Time')]/..//div[1]"));
		System.out.println(current_time.getText());
		driver.close();
	}

}
