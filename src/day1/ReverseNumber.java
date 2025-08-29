//Question : accept a number from user and reverse it
package day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a; //variable declaration
		
		a=123;  //variable initialization  hard code value
		
		Scanner sc=new Scanner(System.in);			  //num		rem
		System.out.println("Please enter a number");  //123     3
		int num=sc.nextInt();
		int rev=0;
		int rem;
		while(num>0)
		{
			rem=num%10;	
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev);
	}

}
