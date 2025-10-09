package day20;

public class ConstructorException {

	public static void main(String[] args) {
		try
		{
		Student s1=new Student("Alice");
		System.out.println(s1);
		
		Student s2=new Student("Ben");
		System.out.println(s2);
		Student s3=new Student(null);
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}

	}

}
