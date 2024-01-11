package methods;

public class Methodreturnvalue {
	
	// modifer returntype methodname(){
		 // }
		
		
		// methods which return value
	
public int add()
{
	int a=10;
	int b=20;
	int c=a+b;
	return c;
}

public String concat()
{
	String s1="Selenium";
	String s2="Training";
	String s3= s1+s2;
	return s3;
}


	public static void main(String[] args) {
		
		// to call any method
				// Create an Object of the class that has your method 
			// syntax : classname objectname = new 	classname();
		
		
		Methodreturnvalue obj=new Methodreturnvalue();
		System.out.println("The output of method add() is: "+obj.add());
		
		
		// store the output of method in a variable
		
		
		String value1 = obj.concat();
		System.out.println(value1);
		
		int var1=obj.add();
		System.out.println(var1);
	}

}
