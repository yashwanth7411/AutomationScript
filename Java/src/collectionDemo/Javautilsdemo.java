package collectionDemo;

import java.util.Date;
import java.util.Scanner;

public class Javautilsdemo {
	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);
		
	/*	Calendar cal=new Calendar();
		int hr=cal.get(Calendar.HOUR_OF_DAY);
		int mins=cal.get(Calendar.MINUTE);
		int secs=cal.get(Calendar.SECOND);
		
		System.out.println(hr+":"+mins+":"+secs);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value A");
		int a=sc.nextInt();
		
		System.out.println("Enter the Value B");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("C : "+c);
		
		
	}
	

}
