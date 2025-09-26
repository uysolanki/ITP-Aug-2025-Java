package day17;

import java.util.Scanner;

public class HDFCBank2 implements BankingService2
{

	double balance;
	
	public HDFCBank2()
	{
		this.balance=5000;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double depositAmount ) {
		this.balance+=depositAmount;			
	}

	@Override
	public void withdraw(double withdrawAmount) {
		this.balance-=withdrawAmount;
	}

	@Override
	public void transfer(double transferAmount) {
		withdraw(transferAmount);
	}

}
