package overriding;


public class Override extends Base{
	
	public void login()
	{
		System.out.println("Open browser");
		System.out.println("Enter pwd");
		System.out.println("Click on Rembember Pwd");
		System.out.println("Enter Email");
		System.out.println("Enter sign in button");
	}
	
	// buy product
	public void buyproduct()
	{
		System.out.println("Enter code to buy product");
	}
	
	public static void main(String[] args) {
		Override o=new Override();
		openbrowser();
		o.login();      // Overriding Rule
		o.buyproduct();
		o.logout();
		
	}
	

}
