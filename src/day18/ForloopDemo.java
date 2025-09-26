package day18;

public class ForloopDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		//classical for loop / traditional for loop				//i		arr[i]
		int sum=0;												//0		10
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			System.out.println(String.format("number at position %d is %d", (i+1),arr[i]));
		}

		System.out.println("Sum using tradtional for loop is "+sum);
		
		//enhanced for loop, for each loop						//num
		int sum1=0;
		for(int num:arr)										//10
		{
			sum1+=num;
		}
		
		System.out.println("Sum using for each loop  is "+sum1);
		
		
		String names[]= {"Alice","Ben","Chris","David","Elcid"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(String.format("Name at position %d is %s", (i+1),names[i]));
		}
		
		for(String name:names)
		{
			System.out.println(name + " is my friend");
		}
	}

}


//number at position 1 is 10
//number at position 2 is 20
//number at position 1 is 10
//number at position 1 is 10
//number at position 1 is 10