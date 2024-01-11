package collectionDemo;

public class Wrapperclass {
	public static void main(String[] args) {
		//primitive types
		int i;
		i=10;
		char c='A';
		
		//convert into references 
		//Boxing 
		
		Integer iref=new Integer(i);
		Character cref=new Character(c);
		
		//Get the primitive out of references
		//UnBoxing
		int k=iref.intValue();
		char ch=cref.charValue();
		
		// Auto Boxing & UnBoxing
		long l=100;
		long lref =l;   //(Long lref=new Long(l);
		
		long m=lref;
		
		System.out.println(k);
		System.out.println(ch);
		System.out.println(m);
		
	}

}
