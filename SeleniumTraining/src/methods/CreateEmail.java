package methods;

public class CreateEmail extends Base_Inheritance{

	//open browser
	//open app
	//login
	//create email
	//logout
	
	public void ComposeEmail()
	{
		System.out.println("compose Email");
	}
	
	
	public static void main(String[] args) {
		
		CreateEmail ce=new CreateEmail();
		ce.openbrowser();
		ce.login();
		ce.logout();
		

	}

}
