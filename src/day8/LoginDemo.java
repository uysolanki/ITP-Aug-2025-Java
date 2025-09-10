package day8;

public class LoginDemo {

	public static void main(String[] args)
	{
		final int a=99;
		a=199;
		Login login=new Login();
		login.email="abc@gmail.com";
		login.setPassword("abc123");
		login.setAtmPin(1234);
		
		//login.displayLogin();
		
		System.out.println(a);
	}
	
	

}
