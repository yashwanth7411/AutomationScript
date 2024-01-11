package data_driven_apache;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {
	public static String getdata(String shno,int ro,int co) throws Throwable{
		FileInputStream f=new FileInputStream("./excel/acti.xlsx");
		Workbook book=WorkbookFactory.create(f);
		String d = book.getSheet(shno).getRow(ro).getCell(co).getStringCellValue();
		return d;	
	}
}
