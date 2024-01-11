package oop;

class parent
{
	void purchaseBike()
	{
		System.out.println("Purchase pulsar");
	}
	
	static void purchasecar()
	{
		System.out.println("Benz");
	}
}

class child extends parent
{
	void purchaseBike()
	{
		System.out.println("Purchase Honda");
	}
	
	static void purchasecar()
	{
		System.out.println("Tata");
	} 
}


public class Overriding {

	public static void main(String[] args) {
		child ch=new child();
		ch.purchaseBike();
		ch.purchasecar();

	}

}
