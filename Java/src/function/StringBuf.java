package function;

public class StringBuf {

	public static void main(String[] args) {
		
		// String Buffer  Mutable
		
		StringBuffer sb1= new StringBuffer("Hello");
		StringBuffer sb2= new StringBuffer("World");
		
		sb1.append(sb2);
		System.out.println("Appended String is: "+sb1);
		
		// String Immutable
		String st1=new String("Hello");
		String st2=new String("World");
		
		st1.concat(st2);
		System.out.println("Concatination String is: "+st1);
	}

}
