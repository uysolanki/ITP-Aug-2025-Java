package day16;

import java.util.Scanner;

public class TurfDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Turf turf=null;
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
		int turfChoice=sc.nextInt();
		
		if(turfChoice>=1 && turfChoice<=4)
		turf=TurfManager.getTurf(turfChoice);
		else
		{
		System.out.println("Invalid choice");
		return;
		}
		Printing.printBill(custName, dateOfPlay, timeOfPlay, turf);

	}

}
