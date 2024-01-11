package com.qa.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {
	public static void main(String[] args) throws Throwable {
	//	WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		FileInputStream f=new FileInputStream("./excel/data.xlsx");
		Workbook book=WorkbookFactory.create(f);
		book.getSheet("sheet1").createRow(0).createCell(0).setCellValue("Yashwanth");
		book.createSheet("sheet2").createRow(3).createCell(3).setCellValue("Selenium");
		FileOutputStream f2=new FileOutputStream("./excel/data.xlsx");
		book.write(f2);
		
	}

}
