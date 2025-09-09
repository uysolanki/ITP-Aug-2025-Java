package day7;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter count of Denomination notes in your country");
		int denominationCount=sc.nextInt();
		
		int currency[]=new int[denominationCount];
		
		System.out.println("enter the "+denominationCount+ " currency denominations");
		
		for(int i=0;i<denominationCount;i++)
		{
			currency[i]=sc.nextInt();
		}
		
		System.out.println("Before : "+Arrays.toString(currency));
		//day5.InsertionSort.insertionSort(currency);
		day6.MergeSortDemo.mergeSort(currency, 0, denominationCount-1);
		System.out.println("After : " +Arrays.toString(currency));
		
		
		System.out.println("Please enter amount you wish to exchange");
		int exchnageAmount=sc.nextInt();
		
		
		
		int notes[]=new int[denominationCount];
		int totalNotes=0;
		for(int i=0;i<currency.length;i++)
		{
			if(exchnageAmount>0)
			{
				notes[i]=exchnageAmount/currency[i];
				exchnageAmount=exchnageAmount%currency[i];
				totalNotes+=notes[i];
			}
		}
		
		

		for(int i=0;i<currency.length;i++)
		{
			if(notes[i]!=0)
			System.out.println(String.format("%d X %d", currency[i],notes[i]));
		}
		
		System.out.println("Total Notes "+totalNotes);
		}
		
		
	}

