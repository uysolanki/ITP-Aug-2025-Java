package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DefaultExceptionHandling {
												//args[0]  args[1]
	public static void main(String[] args)		//"10"     "5"
	{
		
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int numerator=sc.nextInt();
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();
		
//		String name=null;
//		System.out.println(name.length());
		
		double result=numerator/denominator;
		
		System.out.println(result);   //5.0
		}
		
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter integer values only");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Please enter a non zero denominator");
		}
		
		catch(Exception ex)
		{
			System.out.println("Some error Occured");
		}
		
		
		System.out.println("Thank You!!, Visit Again");
		
	}

}
