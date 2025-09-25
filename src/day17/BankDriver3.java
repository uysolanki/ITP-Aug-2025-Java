package day17;

import java.util.Scanner;

public class BankDriver3 {

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
			HDFCBank bank=new HDFCBank();
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
