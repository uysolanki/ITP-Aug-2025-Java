package day2;

public class StringDemo {

	public static void main(String[] args) {
		
//		//String literal
//		String name="Alice";    //1000
//		
//		String name2="Alice";   //1000
//		
//		//String Object
//		String name1=new String("Ben");   //2000
//		
//		String name4="Ben";               //3000
//		
//		
//		System.out.println(name.equals(name2));  //true
//		
//		System.out.println(name1.equals(name4)); //true
//		
//		System.out.println(name1==name4);    //false
//		
		
//		String name5=new String("Chris");  
//		String name6=new String("Chris");  
//		
//		System.out.println(name5.equals(name6)); //true
//		
//		System.out.println(name5==name6);    //false
		
		
		String name7="Dom";  
		String name8="dom";  
		
		System.out.println(name7.equalsIgnoreCase(name8)); //true
		
		System.out.println(name7==name8);    //true

	}

}
