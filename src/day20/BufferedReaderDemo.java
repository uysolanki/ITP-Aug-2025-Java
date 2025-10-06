package day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BufferedReaderDemo {
												
	public static void main(String[] args)		
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
		System.out.println("Enter Numerator");  //apple
		double numerator=Double.parseDouble(br.readLine());
		
		System.out.println("Enter Denominator");  //apple
		double denominator=Double.parseDouble(br.readLine());
		
		double result=numerator/denominator;
		System.out.println(result);
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
