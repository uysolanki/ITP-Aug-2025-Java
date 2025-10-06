package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		int arr[]=new int[2];
		
		Scanner sc=new Scanner(System.in);
	    try
	    {															//      0       1
		System.out.println("Enter Number 1 : ");  //10 						10		0
		arr[0]=sc.nextInt();  
		
		System.out.println("Enter Number 2 :  ");  //0
		arr[1]=sc.nextInt();
		
							try
							{
							System.out.println("Enter the index of the Numerator Number ");//0
							int n=sc.nextInt();    //n=0
							int numerator=arr[n];
							
							System.out.println("Enter the index of the Denominator Number ");//1
							int d=sc.nextInt();    //d=1
							int denominator=arr[d];
							
							
							double result=numerator/denominator;
							}
							catch(ArrayIndexOutOfBoundsException ex2)
							{
								System.out.println("Please enter valid index 0 / 1 only");
							}
							catch(ArithmeticException ex3)
							{
								System.out.println("Please enter valid denominator");
							}
	    }	
	    catch(InputMismatchException ex1)
	    {
	    	System.out.println("Please enter valid Integer values only");
	    }

	}

}
