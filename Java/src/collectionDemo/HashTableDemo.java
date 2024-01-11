package collectionDemo;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer,String>();
		
		ht.put(100, "Bhuvi");
		ht.put(101, "Mohith");
		ht.put(102, "Dhruthi");
		ht.put(103, "Sidhiksha");
		
		for(Entry<Integer, String> m:ht.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
		ht.remove(102);
		System.out.println("Values after remove: "+ ht);
		

	}

}
