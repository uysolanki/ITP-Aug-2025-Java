package day17;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		Customer customer=new Customer("virat@gmail.com","Virat123");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username");
		String user=sc.next();
		
		System.out.println("Enter Password");
		String pass=sc.next();
		
		if(user.equals(customer.getUsername()) && pass.equals(customer.getPassword()))
		{
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
					HDFCBank bank=new HDFCBank();
					switch(choice)
					{
					case 1: 	double bankBalance=bank.showBalance();
								System.out.println("Balance : "+ bankBalance);
								break;
					case 2: 	bank.deposit();
								break;
					case 3: 	bank.withdraw();
								break;
					case 4: 	bank.transfer();
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
