package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Create_po {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qapotracker.azurewebsites.net/");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("loginfmt")).sendKeys("yk@balsambrands.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("Yash1234@");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9"))).click();
	//	driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("KmsiCheckboxField")).click();
		WebElement yes = driver.findElement(By.id("idSIButton9"));
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		yes.click();
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver; 
	//	js.executeScript("document.body.style.zoom='80%'");
		

		// Create PO
		Thread.sleep(2000);
		
		//PO Header
		WebElement create = driver.findElement(By.xpath("(//a[@class='c-sidebar-nav-link'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(create)).click();
		driver.findElement(By.id("PONumber")).sendKeys("1115");
		
		//po_type
		WebElement type = driver.findElement(By.id("POViewModel_POTypeId"));
		Select po_type =new Select(type);
		po_type.selectByVisibleText("Regular");
		// warehouse
		WebElement warehouse = driver.findElement(By.id("POViewModel_WarehouseId"));
		Select wh = new Select(warehouse);
		wh.selectByVisibleText("Amware");
		//supplier
		WebElement supplier = driver.findElement(By.id("POViewModel_SupplierId"));
		Select sup = new Select(supplier);
		sup.selectByVisibleText("Dak");
		//port
		WebElement portdd = driver.findElement(By.id("POViewModel_PortId"));
		Select port = new Select(portdd);
		port.selectByVisibleText("Mumbai");
		//payment term
		WebElement payment = driver.findElement(By.id("POViewModel_PaymentTermId"));
		Select pay = new Select(payment);
		pay.selectByVisibleText("Internal");
		//Fiscal year
		WebElement Fiscalyear = driver.findElement(By.id("POViewModel_SeasonId"));
		Select year = new Select(Fiscalyear);
		year.selectByVisibleText("2023");
		//surcharge
		driver.findElement(By.id("POViewModel_Surcharge")).sendKeys("70");
		//start_date
		driver.findElement(By.id("POViewModel_EtdStartDate")).sendKeys("11032023");
		//end_date
		driver.findElement(By.id("POViewModel_EtdEndDate")).sendKeys("11102023");
		//note_field
		driver.findElement(By.id("POViewModel_Notes")).sendKeys("QA_testing");
		//save button
		driver.findElement(By.id("posubmit")).click();
		
		//PO Detail
		
		//SKU
		driver.findElement(By.id("SkuViewModel_ProductSkuCode")).sendKeys("4001353");
		WebElement brand = driver.findElement(By.id("SkuViewModel_BrandId"));
		Select br=new Select(brand);
		br.selectByVisibleText("BHUS");
		driver.findElement(By.id("SkuViewModel_Quantity")).sendKeys("25");
		driver.findElement(By.id("SkuViewModel_UnitPrice")).sendKeys("18");
		driver.findElement(By.id("btnnewSku")).click();
		
		//pop-up
		wait.until(ExpectedConditions.alertIsPresent());
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Submit for Review']")).click();
		
		

	}
}
