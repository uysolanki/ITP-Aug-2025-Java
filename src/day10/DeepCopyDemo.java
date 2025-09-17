package day10;

public class DeepCopyDemo {

	public static void main(String[] args) {
						//     int double String
		Student s1=new Student(77,78.5,"Shubman");
		System.out.println(s1);

		System.out.println(s1.getRno());  //77
		
		Student s2=new Student(s1);   //copy constructor
		                              //new keyword se object create karte he toh constructor is
									  //called implicitly
		System.out.println(s1.getRno());  //333
		System.out.println(s1==s2);		//false
		
		s2.setSname("Gill");
		
		System.out.println(s2);   //77  Gill 78.5
		
		System.out.println(s1);	  //77 Shubman 78.5
	}

}
