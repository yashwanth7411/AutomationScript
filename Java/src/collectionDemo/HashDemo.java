package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			int i=(Integer) it.next();
			System.out.println(i);
		}
	}

}
