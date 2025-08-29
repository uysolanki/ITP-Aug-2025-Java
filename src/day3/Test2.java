package day3;

public class Test2 {

	public static void main(String[] args) {
		int arr[]={10,20,30}; // non primitive
		System.out.println(arr[0]);  //10
		demo(arr);   //actual parameter  is of Non Primitive type , non primitive type is pass by ref, 
		System.out.println(arr[0]);  //99 call by ref means changes are made on the og

	}

	private static void demo(int brr[])   //formal parameter
	{
		System.out.println(brr[0]);  //10
		brr[0]=99;
		System.out.println(brr[0]);  //99
		
	}

}
