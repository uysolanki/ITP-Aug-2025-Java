package day21;

import java.util.Scanner;

public class Wholesaler2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter quantity");
		int quantity=sc.nextInt();
		
		if(quantity>=500)
		{
			System.out.println("Order Placed");
		}
		else
		{
			throw new LowQuantityException("Please enter quantity > 500");
		}
		
	}
}


//Vi rat
