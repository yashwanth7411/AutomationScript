package methods;

public class DeleteEmail extends Base_Inheritance{
	
	public void deleteEmail()
	{
		System.out.println("Delete Email");
	}

	public static void main(String[] args) {
		DeleteEmail de=new DeleteEmail();
		de.openbrowser();
		de.deleteEmail();


	}

}
