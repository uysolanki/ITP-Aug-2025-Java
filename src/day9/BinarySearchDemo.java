package day9;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int search=40;
		
		int first=0;
		int last=arr.length-1;
		int mid;
		
		while(first<=last)
		{
			mid=(first+last)/2;
			if(arr[mid]==search)
			{
				System.out.println("Found");
				break;
			}
			
			if(search>arr[mid])
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
