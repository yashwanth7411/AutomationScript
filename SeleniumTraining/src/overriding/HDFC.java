package overriding;

public class HDFC {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.Account();
		h.Debitcard();
		h.bills();

	}
	
	public void Account()
	{
		System.out.println("Account for HDFC");
	}
	
	public void Debitcard()
	{
		System.out.println("Debit card for HDFC");
	}
	
	public void bills()
	{
		System.out.println("Bills for HDFC");
	}

}
