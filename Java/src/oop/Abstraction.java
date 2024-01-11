package oop;

abstract class shape1
{
	shape1()
	{
		System.out.println("Parent");
	}
	abstract void draw();
	abstract void fun();
}

class circle1 extends shape1
{
	void draw()
	{
		System.out.println("Circle");
	}
	
	void fun()
	{
		System.out.println("Have Fun");
	}
}

class rectangle1 extends shape1
{
	void draw()
	{
		System.out.println("Rectangle");
	}
	void fun()
	{
		System.out.println("Have Fun");
	}
}
class polygon extends shape1
{
	void draw()
	{
		System.out.println("Polygon");
	}
	void fun()
	{
		System.out.println("Have Fun");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		shape1 s;
		s=new circle1();
		s=new rectangle1();
		s=new polygon();
		s.draw();
		s.fun();
		
		

	}

}
