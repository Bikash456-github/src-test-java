package practiceonly;

 class amazon2 {
	void login()
	{
		System.out.println("mobilenumber");
	}
	}
public  class amazon extends amazon2
	{
	void login()
	{
		
		System.out.println("emailaddress");
		super.login();
	}	
	public static void main(String[] args) {
		amazon a1=new amazon ();
		a1.login();
		
	}
	}	

	
	
	

