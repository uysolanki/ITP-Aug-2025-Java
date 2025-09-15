package day10;

public class DriverApp {

	public static void main(String[] args) {
		Student s1=new Student();  //as we have not written any constructor the object
								   //s1 is using the default constructor of java
										//rno = 0 , sname=null, per =0.0
		
									//after writing the public Student() NoArgsConstructor
									//the defualt construcotor gifted by java will no longer be used

		System.out.println(s1);
		
		 
		Student s2=new Student(); 
		Student s3=new Student(); 
		Student s4=new Student();
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
							//int  String  double
		Student s5=new Student(45,"Rohit",87.5);   //calling the Parameterised constructor
		System.out.println(s5);
		
		Student s6=new Student(s5);
		System.out.println(s6);
	}

}
