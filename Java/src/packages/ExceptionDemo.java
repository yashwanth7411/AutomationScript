package packages;
class samplemath
{
	void sum(int a,int b)
	{
		System.out.println("Sum: "+(a+b));
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Main is starting");
		int d=11;
		int e=12;
		int f=d+e;
		System.out.println("Sum of F is: "+f);
		int arr[]= {10,20,30,40};
		try
		{
			int h=f/0;
		System.out.println("Arr[2] "+arr[20]);
		}
	//	catch(ArrayIndexOutOfBoundsException er)
	//	{
	//		System.out.println("Some Exception");
	//	}
		
		catch(Exception g)
		{
			System.out.println("Message for the exception: "+g);
		}
		finally
		{
			System.out.println("I am Important code");
		}
		
		System.out.println("Main has ended");
		samplemath sm=new samplemath();
		sm.sum(10, 20);
		
	}
}

// ----- Observation ------------

// arr[20] doesn't exist
//compiler didnot give any error
//arrays are created at run-time