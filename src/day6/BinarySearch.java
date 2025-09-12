package day6;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int search=41;
		
		int first=0;
		int last=arr.length;
		int mid;
		
		while(first<=last)
		{
			mid=(first+last)/2;
			if(search==arr[mid])
			{
				System.out.println("Found at Index "+mid);
				break;
			}
			else if(search>arr[mid])
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		
		if(first>last)
			System.out.println("Not Found");

	}

}
