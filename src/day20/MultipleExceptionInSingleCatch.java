package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int numerator=sc.nextInt();
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();
		
		double result=numerator/denominator;
		System.out.println(result);
		}
		
		catch(InputMismatchException | ArithmeticException 	 ex)
		{
			System.out.println("Invalid Data");
		}
		
		finally
		{
			System.out.println("Thank You!!, Visit Again");
		}
	}

}
