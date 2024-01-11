package oop;

class Base
{
	static int y;
	int x;
	void show()
	{
		System.out.println("This is a show");
	}
	
	static void staticsshow()
	{
		System.out.println("This is static show");
	}
}

class derived extends Base
{
	
}

public class Inheritance {

	public static void main(String[] args) {
	derived d=new derived();
	d.show();
	d.staticsshow();

	}

}
