package day27;

public class SumOfTwo {

	public static void main(String[] args) {
		int arr[]= {100,500,200,300,75,400};
		int sum=600;
		
		for(int i=0;i<arr.length;i++)				//i			arr[i]   num1	num2
		{											//0         100      100    200
			int num1=arr[i];
			int num2=sum-num1;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==num2 && arr[j]<num1)
				{
					System.out.println("["+num1+","+num2+"]");
				}
			}
		}

	}

}
