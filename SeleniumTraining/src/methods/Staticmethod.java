package methods;

public class Staticmethod {
	
	public static int mul()
	{
		int x=2;
		int y=3;
		return x*y;
	}
	
	public static void learning()
	{
		System.out.println("Selenium Learning");
	}

	public static void main(String[] args) {
		int var1=mul();
		System.out.println(mul());
		System.out.println("The result of value: "+var1);
		learning();
		
		

	}

}
