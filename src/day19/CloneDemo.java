package day19;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(4,"Abhishek",78.5);
		System.out.println(s1);

		Student s2=s1.clone();
		
		System.out.println(s2);
		
		System.out.println(s1==s2);  //false
	}

}
