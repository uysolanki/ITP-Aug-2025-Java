package day8;

public class Login {

	public String email;
	private String password;		//CM of Mh
	private int atmPin;				//CM of Rj
	
	public void setPassword(String a) //inward PA for Password
	{
	this.password=a;	
	}
	
	public String getPassword()
	{
		return this.password;
	}
}
