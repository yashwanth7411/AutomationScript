package data_driven_apache;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream f=new FileInputStream("./excel/data.xlsx");
		Workbook book=WorkbookFactory.create(f);
//		book.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Suni");
//		FileOutputStream f2=new FileOutputStream("./excel/data.xlsx");
//		book.write(f2);
		
		book.createSheet("sheet2").createRow(10).createCell(10).setCellValue("Olympic");
		FileOutputStream f2=new FileOutputStream("./excel/data1.xlsx");
		book.write(f2);
	}

}
