package day21;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args)   throws ArithmeticException   // caller
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Numerator");			//accept values
		int numerator=sc.nextInt();
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();
		
		
		double ans=divide(numerator,denominator);
		System.out.println(ans);
		
		System.out.println("Hiii");
		
	}

	private static double divide(int numerator,int denominator) throws ArithmeticException,InputMismatchException,NullPointerException			
	{	
		return numerator/denominator;			
	}
		

	
}
