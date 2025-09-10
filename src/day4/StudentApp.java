package day4;

public class StudentApp {

	public static void main(String[] args) {
		Student.demo();
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.displyStudent();
		s2.displyStudent();
		s3.displyStudent();
		
		s1.acceptStudentFromUser();
		s2.acceptStudentFromUser();
		s3.acceptStudentFromUser();
		
		s1.displyStudent();
		s2.displyStudent();
		s3.displyStudent();
		
		
	}

}
