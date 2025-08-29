package day3;

public class Test {

	public static void main(String[] args) {
		double salman=10;   //primitive
		System.out.println(salman);  //10
		demo(salman);   //actual parameter  is of Primitive type , primitive type is pass by value, 
		System.out.println(salman);//10 call by value means changes are made on the copy the og remains intact

	}

	private static void demo(double parvez)   //formal parameter
	{
		System.out.println(parvez);  //10
		parvez=99;
		System.out.println(parvez);  //99
		
	}

}
