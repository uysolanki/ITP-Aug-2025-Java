package day19;

public class SastaDeepcopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(4,"Abhishek",78.5);
		System.out.println(s1);
		Student s2=new Student();
		s2.setPer(s1.getPer());
		s2.setRno(s1.getRno());
		s2.setSname(s1.getSname());
		
		System.out.println(s2);
		System.out.println(s1==s2);
	}

}
