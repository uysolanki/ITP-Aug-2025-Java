package day10;

public class ShallowCopyDemo {

	public static void main(String[] args) {
		Student s1=new Student(77,"Shubman",78.5);
		System.out.println(s1);

		System.out.println(s1.getSname());
		Student s2=s1;
		System.out.println(s2.getSname());
		
		s2.setSname("Gill");
		System.out.println(s2.getSname());
		System.out.println(s1.getSname());
		
		System.out.println(s1==s2);   // == ref comparison, true
		
	}

}
