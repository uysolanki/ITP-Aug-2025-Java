package day1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			  //num		rem
		System.out.println("Please enter radius");  //123     3
		int radius=sc.nextInt();
		
		//double area=3.14*radius*radius;
		double area=java.lang.Math.PI*radius*radius;
		
		System.out.println("Area of Circle "+area);
		
		System.out.println(java.lang.Math.log10(100));
	}

}
