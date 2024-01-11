package function;

public class MethodOverloading {

	public static void main(String[] args) {
		Area a=new Area();
		a.calculate(10);
		a.calculate(10, 15);
	}
}

	class Area{
		void calculate(int side)
		{
			int a=side*side;
			System.out.println("Area of square: "+a);
		}
		
		void calculate(int l,int b)
		{
			int a= l * b;
			System.out.println("Area of Rectangle: "+a);
		}
	}
