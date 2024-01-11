package oop;

class counter
{
	int count;
	static int scount;
	counter()
	{
	count=1;
	scount=1;
	}
	
	void increment()
	{
		count++;
		scount++;
	}
	
	void countshow()
	{
		System.out.println("Count :"+count);
		System.out.println("Scount :"+scount);
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		counter c1=new counter();
		counter c2=new counter();
		
		c1.increment();
		c2.increment();
		c1.increment();
		c1.increment();
		c1.scount=200;
		counter.scount=250;
		c2.scount=300;
		c1.countshow();
		c2.countshow();

	}

}
