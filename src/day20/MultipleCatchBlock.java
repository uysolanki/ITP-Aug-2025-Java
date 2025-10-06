package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Numerator");  //apple
		int numerator=sc.nextInt();  
		
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();
		
		double result=numerator/denominator;
		
		System.out.println(result);
		
	}

}
