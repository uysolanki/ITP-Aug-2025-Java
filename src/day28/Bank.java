package day28;

public class Bank {
	
	private double balance;

	public Bank() {}
	public Bank(int bal)
	{
		this.balance=bal;
	}
	
	public double getBalance() {
		return balance;
	}

	
	public synchronized void deposit(int dAmt)
	{
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e1) {}
		this.balance+=dAmt;
		notify();
	}
	
	public synchronized void withdraw(int wAmt) 
	{
		do
		{
			System.out.println("Insufficient Funds " + getBalance());
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(wAmt>this.balance);
		this.balance-=wAmt;
		System.out.println("Withdraw Successful " + getBalance());
	}
	

}
