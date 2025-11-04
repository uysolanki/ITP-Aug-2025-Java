package day31;

public class AutoboxingDemo {

	public static void main(String[] args) {
	int a=10;
	System.out.println(a);
	Integer aobj=new Integer(a);  //autoboxing
	System.out.println(aobj);
	
	int b=aobj.intValue();        //unboxing
	System.out.println(b);
	

	}

}
