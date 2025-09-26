package day17;

import java.util.Scanner;

public class BankDriver4 {

	public static void main(String[] args) {
		Customer2 customer1=new Customer2("virat@gmail.com","Virat123");
		Customer2 customer2=new Customer2("rohit@gmail.com","Rohit123");
		Customer2 customer3=new Customer2("hardik@gmail.com","Hardik123");
		
		
		Customer2 customers[]=new Customer2[3];
		
		customers[0]=customer1;
		customers[1]=customer2;
		customers[2]=customer3;
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username");   //rohit@gmail.com
		String user=sc.next();
		
		System.out.println("Enter Password");   //Rohit123
		String pass=sc.next();
		
		boolean result=false;
		for(Customer2 customer : customers)
		{
			result=customer.login(user, pass);
			if(result==true)
				break;
		}
	
		if(result)
		{
			HDFCBank2 bank=new HDFCBank2();
			int choice;
				do {
					System.out.println("*** MENU ***");
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit");
					System.out.println("3. Withdraw");
					System.out.println("4. Money Transfer");
					System.out.println("0. Exit");
					
					System.out.println("Choice :");
					choice=sc.nextInt();
					
					switch(choice)
					{
					case 1: 	double bankBalance=bank.getBalance();
								System.out.println("Balance : "+ bankBalance);
								break;
								
					case 2: 	System.out.println("Enter amount to deposit");
					            double depositAmount=sc.nextDouble();
					            if(depositAmount>0)
					            {
								bank.deposit(depositAmount);
					            System.out.println("Deposit Successful");
					            System.out.println("Balance : "+ bank.getBalance());
					            }
					            else
					            System.out.println("Please enter valid Amouunt");
								break;
					case 3: 	System.out.println("Enter amount to withdraw");
								double withdrawAmount=sc.nextDouble();
								if(withdrawAmount>0 && withdrawAmount<=bank.getBalance())
								{
									bank.withdraw(withdrawAmount);
						            System.out.println("Withdraw Successful");
						            System.out.println("Balance : "+ bank.getBalance());
								}
								else
						            System.out.println("Please enter valid Amouunt");
								break;
								
					case 4: 	int smsOTP=GenerateOTP.getOTP();
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
								break;
					case 0 :  	System.exit(0);
					default :  System.out.println("Invalid Input");
					
					}
				}while(choice!=0);
		}
		else
		{
			System.out.println("Invalid Credentials");
		}

	}

}
