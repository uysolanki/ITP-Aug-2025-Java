package day15;

import java.util.Scanner;

public class TurfDriver3 {

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
		System.out.println("4. Skating");
		
		String turfName="";
		double turfPrice=0;
		int turfType=sc.nextInt();
		switch(turfType)
		{
		case 1 : 	turfName="Cricket";
					turfPrice=800;
					break;
		case 2 : 	turfName="Football";
					turfPrice=1000;
					break;
		
		case 3 : 	turfName="Tennis";
					turfPrice=1500;
					break;
					
		case 4 : 	turfName="Skating";
					turfPrice=2500;
					break;
		case 0 : System.out.println("System shutting down..."); System.exit(0);
		default : System.out.println("Invalid Input");
		}
		
		printBill(custName,dateOfPlay,timeOfPlay,turfName,turfPrice);

	}
	

	private static void printBill(String custName, String dateOfPlay, String timeOfPlay, String turfName,
			double turfPrice) {
		System.out.println("**** BILL ****");
		System.out.println(String.format("%-20s %-20s", "Customer Name : ",custName));
		System.out.println(String.format("%-20s %-20s", "Date Of Play :",dateOfPlay));
		System.out.println(String.format("%-20s %-20s", "Time Of Play :",timeOfPlay));
		System.out.println(String.format("%-20s %-20s", "Turf Type : ",turfName));
		System.out.println(String.format("%-20s %-20f", "Price : ",turfPrice));	
	}
}
