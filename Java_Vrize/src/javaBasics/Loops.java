package javaBasics;

public class Loops {
	public static void main(String[] args)
	{
		// Find the sum of nth natural numbers
		
		//while loop
		int n=10; int i=1; int sum=0;
		while(i<=n)
		{
			sum=sum+i;
		i++;
		}
		System.out.println("Sum="+sum);
		
		int j=n;
		sum=0;
		while(j>=1)
		{
			sum=sum+j;
		j--;
		}
		System.out.println("Sum="+sum);
		
		// for loop
		sum=0;
		for(int k=1;k<=n;k++)
		{
			sum=sum+k;		
		}
		System.out.println("Sum="+sum);
		
		
		
	}

}
