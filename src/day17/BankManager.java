package day17;

import java.util.Scanner;

public class BankManager {
	
	static Scanner sc=new Scanner(System.in);
	public static void deposit(HDFCBank2 bank)
	{
		System.out.println("Enter amount to deposit");
        double depositAmount=sc.nextDouble();
        if(depositAmount>0)
        {
		bank.deposit(depositAmount);
        System.out.println("Deposit Successful");
        System.out.println("Balance : "+ bank.getBalance());
        }
        else
        System.out.println("Please enter valid Amouunt");
	}
	
	public static void withdraw(HDFCBank2 bank)
	{
		System.out.println("Enter amount to withdraw");
		double withdrawAmount=sc.nextDouble();
		if(withdrawAmount>0 && withdrawAmount<=bank.getBalance())
		{
			bank.withdraw(withdrawAmount);
            System.out.println("Withdraw Successful");
            System.out.println("Balance : "+ bank.getBalance());
		}
		else
            System.out.println("Please enter valid Amouunt");
	}
	
	public static void transfer(HDFCBank2 bank)
	{
		int smsOTP=GenerateOTP.getOTP();
		System.out.println("SMS OTP "+smsOTP);
		
		System.out.println("Enter OTP");
		int userOTP=sc.nextInt();
		
		if(smsOTP==userOTP)
		{
			System.out.println("Enter amount to Transfer");
			double transferAmount=sc.nextDouble();
			if(transferAmount>0 &&  transferAmount<=bank.getBalance())
			{
			bank.transfer(transferAmount);
			System.out.println("Transfer Successful");
            System.out.println("Balance : "+ bank.getBalance());
			}
			else
			{
				System.out.println("Please enter valid Amount");
			}
		}
		else
		{
			System.out.println("Invalid OTP");
		}
	}

}
