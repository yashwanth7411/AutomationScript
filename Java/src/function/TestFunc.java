package function;

public class TestFunc {
	public static void main(String[] args) {
		System.out.println("Area of Rectangle: "+RectArea(15,10));
		System.out.println("Area of Perimiter: "+RectPerimiter(15,10));
		System.out.println("Area of Rectangle: "+RectArea(15,5));
		System.out.println("Area of Perimiter: "+RectPerimiter(15,10));
		System.out.println("Area of Rectangle: "+RectArea(25,10));
		System.out.println("Area of Perimiter: "+RectPerimiter(15,10));
	}
		public static int RectArea(int length,int width)
		{
			return length * width;
		}
		
		public static int RectPerimiter(int length, int width)
		{
			return 2 *(length+width);
		}
}
