package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		List<Student> fyStudents=new ArrayList();
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(1,"Rahul",87.5);
		Student s3=new Student(45,"Rohit",68.5);
		
		fyStudents.add(s1);
		fyStudents.add(s2);
		fyStudents.add(s3);
		
		List<Student> syStudents=new ArrayList(Arrays.asList(new Student(77,"Shumban",98.5),new Student(33,"Hardik",58.5),new Student(63,"Surya",78.6)));
		
		List<Student> tyStudents=new ArrayList();
		tyStudents.add(new Student(4,"Abhishek",78.9));
		tyStudents.add(new Student(16,"Rishab",65.5));
		tyStudents.add(new Student(17,"Abd",87.4));
		
		List<List<Student>> bca = new ArrayList();
		bca.add(fyStudents);
		bca.add(syStudents);
		bca.add(tyStudents);
		
		for(int i=0;i<bca.size();i++)
		{
			double maxPer=0;
			
			Student topper=null;
			for(Student student:bca.get(i))					//maxPer//student				topperStudentName
			{											  	//0		//18,"Virat",78.5		null				78.5>0 True
															//78.5	//1,"Rahul",87.5		"Virat"				87.5>78.5 True
				if(student.getPer()>maxPer)					//87.5	 45,"Rohit",68.5		"Rahul"             68.5>87.5 False
				{
					maxPer=student.getPer();
					topper=student;
				}
			}
			System.out.print("Topper of " + (i+1) + "Year is ");
			System.out.println(String.format("Topper Student name is %s ID is %d per is %f",topper.getSname(),topper.getRno(),topper.getPer()));
		}

	}
}
