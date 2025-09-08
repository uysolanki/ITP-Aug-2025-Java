package day6;

import java.util.Arrays;

public class MergeSortDemo{

	public static void main(String[] args) {
		int arr[]= {9,3,8,1,7,4,5,2};
		System.out.println("Before Sorting "+Arrays.toString(arr));
		split(arr,0,arr.length-1);
		System.out.println("After Sorting "+Arrays.toString(arr));
	}

	private static void split(int[] arr, int first, int last) {
		
		if(first<last)
		{
		int mid=(first+last)/2;
		split(arr,first,mid);
		split(arr,mid+1,last);
		merge(arr,first,mid,last);
		}
			
	}

	private static void merge(int[] arr, int first, int mid, int last) {
		int i=first;
		int j=mid+1;
		int k=first;
		int brr[]=new int[last+1];
		
		while(i<=mid && j<=last)
		{
			if(arr[i]<=arr[j])
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
		{
			while(j<=last)
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
		
		
		for(int z=first;z<=last;z++)
		{
			arr[z]=brr[z];
		}
	}
		
}
