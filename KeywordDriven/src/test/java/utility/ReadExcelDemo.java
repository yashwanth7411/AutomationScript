package utility;

import java.io.FileInputStream;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDemo {
	static Workbook book;
	static Sheet sheet;
	
	public static void readexcel(String path, String sheetname) throws Throwable
	{
		FileInputStream file=new FileInputStream(path);
		 book=WorkbookFactory.create(file);
		 sheet=(Sheet) book.getSheet(sheetname);
	}
	
	public static String getData(int rownum, int col)
	{
		
	}

}
