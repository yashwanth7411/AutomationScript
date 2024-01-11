package javaProgram;

public class Switchcase {

	public static void main(String[] args) {
		int weather=2;
		
		switch(weather)
		{
		case 0:
			System.out.println("Its sunny today");
			break;
		case 1:
			System.out.println("Its rainy today");
			break;
		case 2:
			System.out.println("Its cloudy today");
			break;
		default:
			System.out.println("Its Normal today");
			break;
		}

	}

}
