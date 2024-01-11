package function;

class Sample
{
	int data;
	Sample(int d)
	{
		data=d;
	}

	void show()
	{
		System.out.println("Data: "+data);
		
	}
}
public class CallByRefrence {
	static void increase(Sample p)
	{
		p.data=p.data+1;
	}
	public static void main(String[] args) {
		Sample s=new Sample(5);
		increase(s);
		s.show();

	}
}
