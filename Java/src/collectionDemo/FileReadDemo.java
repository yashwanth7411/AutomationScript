package collectionDemo;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Java\\src\\collectionDemo\\Wrapperclass.java");
		FileInputStream fs=null;
		try {
			fs=new FileInputStream(file);
			System.out.println("Total file size to read (in bytes) : "+fs.available());
			
			int content;
			while((content = fs.read()) != -1)
			{
				System.out.print((char) content);
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fs!=null)
				{
					fs.close();
				}
			}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}

	}

