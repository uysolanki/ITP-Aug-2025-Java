package day17;

import java.util.Scanner;

public class BankDriver5 {

	public static void main(String[] args) {
		
		
		Customer2 customers[]=CustomerDatabase.getAllCustomers();
		
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
					case 2: 	BankManager.deposit(bank);
								break;
					case 3: 	
								BankManager.withdraw(bank);
								break;			
					case 4: 	BankManager.transfer(bank);
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
