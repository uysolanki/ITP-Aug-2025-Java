package day6;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int arr[]= {30,10,50,40,20};
		int search=10;
		
		linearSearch(arr,search);

	}

	private static void linearSearch(int[] arr, int search) {
		//int flag=0; //assume not found
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Found");
				//flag=1;
				break;
			}
		}
		
		if(i==arr.length)
			System.out.println("Not Found");
		
	}

}
