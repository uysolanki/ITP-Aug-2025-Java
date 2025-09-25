package day17;

import java.util.Scanner;

public class HDFCBank implements BankingService
{

	double balance;
	
	public HDFCBank()
	{
		this.balance=5000;
	}
	
	@Override
	public double showBalance() {
		return this.balance;
	}

	@Override
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		double depositAmount=sc.nextDouble();
		
		this.balance+=depositAmount;	
	}

	@Override
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		double withdrawAmount=sc.nextDouble();
		
		this.balance-=withdrawAmount;
	}

	@Override
	public void transfer() {
		int smsOTP=GenerateOTP.getOTP();
		System.out.println("SMS OTP "+smsOTP);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP");
		int userOTP=sc.nextInt();
		
		if(smsOTP==userOTP)
		{
			System.out.println("Enter amount to Transfer");
			double transferAmount=sc.nextDouble();
			
			this.balance-=transferAmount;
		}
		else
		{
			System.out.println("Invalid OTP");
		}
	}

}
