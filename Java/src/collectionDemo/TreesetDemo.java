package collectionDemo;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Ramya");
		ts.add("Sidhiksha");
		ts.add("Santhosh");
		ts.add("Bhagya");
		ts.add("Yash");
		System.out.println(ts);
		
		for(String i:ts)
		{
			System.out.println(i);
		}
	}
}
