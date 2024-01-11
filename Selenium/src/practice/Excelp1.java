package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelp1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream f=new FileInputStream("./excel/p1.xlsx");
		Workbook book = WorkbookFactory.create(f);
		book.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Selenium_Automation");
		book.createSheet("sheet2").createRow(10).createCell(10).setCellValue("DataDriven");
		FileOutputStream f1=new FileOutputStream("./excel/p1.xlsx");
		book.write(f1);
	}
}
