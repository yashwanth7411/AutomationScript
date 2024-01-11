package javaBasics;

public class Factorial {
	static public void main(String[] args) {
		
		int n1=3;
		int n2=7;
		
		int result=fact(n1);
		int res2=fact(n2);
		System.out.println("First Factorial="+result+",Second Factorial="+res2);
	}
		
		
		
		
		public static int fact(int n)
		{
		int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
			
	}
