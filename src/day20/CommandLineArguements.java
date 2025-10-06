package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineArguements {
												//args[0]  args[1]
	public static void main(String[] args)		//"10"     "5"
	{
		
		try
		{
		int numerator=Integer.parseInt(args[0]);
		
		int denominator=Integer.parseInt(args[1]);
		
		double result=numerator/denominator;
		
		System.out.println(result);
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
		
		finally
		{
			System.out.println("Thank You!!, Visit Again");
		}
	}

}
