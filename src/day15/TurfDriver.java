package day15;

import java.util.Scanner;

public class TurfDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String custName=sc.next();
		
		System.out.println("Enter Date Of Play");
		String dateOfPlay=sc.next();
		
		System.out.println("Enter Time Of Play");
		String timeOfPlay=sc.next();
		
		System.out.println("Turf Options");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		
		int turfType=sc.nextInt();
		switch(turfType)
		{
		case 1 : 	System.out.println("**** BILL ****");
					System.out.println("Customer Name : "+custName);
					System.out.println("Date Of Play :"+dateOfPlay);
					System.out.println("Time Of Play :"+timeOfPlay);
					System.out.println("Turf Type : Cricket");
					System.out.println("Price :700");
					break;
		case 2 : 	System.out.println("**** BILL ****");
					System.out.println("Customer Name : "+custName);
					System.out.println("Date Of Play :"+dateOfPlay);
					System.out.println("Time Of Play :"+timeOfPlay);
					System.out.println("Turf Type : Football");
					System.out.println("Price :1000");
					break;
		
		case 3 : 	System.out.println("**** BILL ****");
					System.out.println("Customer Name : "+custName);
					System.out.println("Date Of Play :"+dateOfPlay);
					System.out.println("Time Of Play :"+timeOfPlay);
					System.out.println("Turf Type : Tennis");
					System.out.println("Price :1500");
					break;
		case 0 : System.out.println("System shutting down..."); System.exit(0);
		default : System.out.println("Invalid Input");
		}
		

	}

}
