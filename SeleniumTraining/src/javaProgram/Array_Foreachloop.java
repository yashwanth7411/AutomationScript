package javaProgram;

public class Array_Foreachloop {

	public static void main(String[] args) {
		int a=25;
		String s="Yashwanth";
		
		// Array : object in java store multiple value of same data type
		// datatype [] objectname = {"value1", "value2"}
		
		String [] coffee = {"with sugar","with cream","black","crisp"};
		System.out.println(coffee[2]);

		
		//  FOR Each LOOP
		
		for(String temp:coffee)
		{
			System.out.println(temp);
		}
		
		// FOR EACH LOOP One by one traverse
		
		for(String temp:coffee)
		{
			if(temp=="with cream")
			{
				System.out.println(temp);
			}
		}
	}

}
