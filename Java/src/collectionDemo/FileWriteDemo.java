package collectionDemo;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException{
		File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Java\\src\\collectionDemo\\file1.txt");
		FileInputStream fin= null;
		FileOutputStream fout=null;
		
		try
		{
			fin =new FileInputStream(file);
			fout=new FileOutputStream("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Java\\\\src\\\\collectionDemo\\\\file2.txt");
			int content;
			while((content=fin.read()) != -1)
			{
				fout.write(content);
			}
			System.out.println("File Copied Successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		fin.close();
		fout.close();
		

	}

}
