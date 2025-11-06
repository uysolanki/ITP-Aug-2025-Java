package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		List<Student> students=new ArrayList();
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(1,"Rahul",87.5);
		Student s3=new Student(45,"Rohit",68.5);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		List<Student> students1=new ArrayList(Arrays.asList(s1,s2,s3));
		
		List<Student> students2=new ArrayList();
		students2.add(new Student(18,"Virat",78.5));
		students2.add(new Student(1,"Rahul",87.5));
		students2.add(new Student(45,"Rohit",68.5));
		
		//display name of all Students
//		for(Student student:students)
//		{
//			System.out.println(student.getSname());
//		}
		
		//display name of student having max percentage
		
		double maxPer=0;
		
		Student topper=null;
		for(Student student:students)					//maxPer//student				topperStudentName
		{											  	//0		//18,"Virat",78.5		null				78.5>0 True
														//78.5	//1,"Rahul",87.5		"Virat"				87.5>78.5 True
			if(student.getPer()>maxPer)					//87.5	 45,"Rohit",68.5		"Rahul"             68.5>87.5 False
			{
				maxPer=student.getPer();
				topper=student;
			}
		}
		System.out.println(String.format("Topper Student name is %s ID is %d per is %f",topper.getSname(),topper.getRno(),topper.getPer()));

	}

}
