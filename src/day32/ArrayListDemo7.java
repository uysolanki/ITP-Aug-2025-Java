package day32;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		List<Student> fyStudents=new ArrayList();
		Address address1=new Address(1,"Flat","Bengaluru");
		Address address2=new Address(2,"Bunglow","Delhi");
		Address address3=new Address(3,"PentHouse","Mumbai");
		Student s1=new Student(18,"Virat",78.5,address2);
		Student s2=new Student(1,"Rahul",87.5,address1);
		Student s3=new Student(45,"Rohit",68.5,address3);
		
		fyStudents.add(s1);
		fyStudents.add(s2);
		fyStudents.add(s3);
		
		//display name of students staying in Delhi
		
		for(Student student:fyStudents)
		{
			if(student.getAddress().getCity().equals("Delhi"))
			{
				System.out.println(student.getSname());
			}
		}
		
	}
}
