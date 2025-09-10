package day8;

public class Login {

	public String email;
	private String password;		//CM of Mh
	private int atmPin;				//CM of Rj
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAtmPin() {
		return atmPin;
	}
	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	
	
//	public void displayLogin()
//	{
//		System.out.println("email ID "+ this.email + " password is " + this.password + " Atm Pin is " + this.atmPin);
//	}
	
	@Override
	public String toString() {
		return "My email ID "+ this.email + " My password is " + this.password + " My Atm Pin is " + this.atmPin;
	}
	
	
	
}
