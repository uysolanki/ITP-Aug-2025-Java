package day28;

public class Son extends Thread
{
    Bank bank;
	public Son(Bank bank)
	{
		this.bank=bank;
	}
	
	
	@Override
	public void run() {
		this.bank.withdraw(10000);
	}
}
