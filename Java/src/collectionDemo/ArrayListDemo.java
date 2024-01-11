package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList ArrayListone =new ArrayList();
		ArrayList<String> names =new ArrayList<String>();
		
		names.add("John");
		names.add("julie");
		names.add("peter");
		names.add("jimmy");
		names.remove(1);
		names.set(2, "paul");
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		System.out.println(names);
		for(String i:names)
		{
			System.out.println(i);
		}
		
		ArrayList namecopy=new ArrayList();
		namecopy.addAll(names);
		System.out.println(namecopy);
		
		String ram="Ramsay";
		names.add(ram);
		if(names.contains(ram))
		{
			System.out.println("ram is Here");
		}

		if(names.containsAll(namecopy))
		{
			System.out.println("Everything in names is present in namescopy");
		}
	}

}
