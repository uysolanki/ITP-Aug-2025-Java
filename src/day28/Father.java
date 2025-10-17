package day28;

public class Father extends Thread
{
	Bank bank;
	public Father(Bank bank)
	{
		this.bank=bank;
	}
	
	@Override
	public void run() {
		this.bank.deposit(4000);
		this.bank.deposit(4000);
	}
}
