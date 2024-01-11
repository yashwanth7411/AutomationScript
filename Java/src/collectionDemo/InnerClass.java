package collectionDemo;

class Outer{
	class Inner{
		void test()
		{
			System.out.println("In the Inner Class");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner ob=out.new Inner();
		ob.test();

	}

}
