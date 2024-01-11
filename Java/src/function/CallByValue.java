package function;

public class CallByValue {

	public static void main(String[] args) {
		int a=6;
		increase(a);
		System.out.println("Value of a: "+a);
	}
		
		static void increase(int p)
		{
			p=p+1;
		}
}
