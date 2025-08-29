package com.itp.app;

import java.util.Arrays;
import java.util.Scanner;

public class MobileNumber {
	public static void main(String[] args) {
		
		long mobiles[]=new long[5];
		int i;
		long mob;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			System.out.println("Enter a Mobile Number");
			mobiles[i]=sc.nextLong();
		}
		int oddc,evenc;
		System.out.println(Arrays.toString(mobiles));
		for(i=0;i<2;i++)
		{
			mob=mobiles[i];
			oddc=0;
			evenc=0;
			while(mob>0)
			{
			int rem=(int)mob%10;
			
			if(rem%2==0)
				evenc++;
			else
				oddc++;
			
			mob=mob/10;
			}
			
//			System.out.print("Number" + (i+1) + " is " + mobiles[i] + " has " + evenc + " even and " +oddc +" odd digits hence it is a ");
			System.out.print(String.format("Number %d is %d has %d even and %d odd digits hence it is a", (i+1),mobiles[i],evenc,oddc)); 

			if(oddc>evenc)
				System.out.println(" Odd Biased Number");
			else if(oddc<evenc)
				System.out.println(" Even Else Number");
			else
				System.out.println(" Neutral Number");
		}
		
	}

}
//Number 1 is 8888111222 has 7 even and 3 odd digits hence it is a Even Biased Number