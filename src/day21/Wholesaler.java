package day21;

import java.util.Scanner;

public class Wholesaler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter quantity");
		int quantity=sc.nextInt();
		try
		{
		if(quantity>=500)
		{
			System.out.println("Order Placed");
		}
		else
		{
			throw new LowQuantityException("Please enter quantity > 500");
		}
		}
		catch(LowQuantityException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("Thank You!!, Visit again");
		}
	}

}
