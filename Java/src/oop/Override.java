package oop;

class shape
{
	void draw()
	{
		System.out.println("shape");
	}
}

class circle extends shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}

class rectangle extends shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}

public class Override {

	public static void main(String[] args) {
		shape s;
		s=new circle();
		s.draw();
		

	}

}
