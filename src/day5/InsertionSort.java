package day5;

import java.util.Arrays;

public class InsertionSort 
{
public static void main(String[] args) {
	
	int arr[]= {5,4,1,3,2};
	System.out.println("Before " +Arrays.toString(arr));
	insertionSort(arr);
	System.out.println("After " +Arrays.toString(arr));
}

public static void insertionSort(int arr[])
{
	int temp,j,k;
	for(k=1;k<arr.length;k++)
	{
		temp=arr[k];
		j=k-1;
		
		while(j>=0 && temp>arr[j])
		{
			arr[j+1]=arr[j];
			j--;
		}
		
		arr[j+1]=temp;
	}
}
}

