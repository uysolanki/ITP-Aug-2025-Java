//no duplicates
//Ascending order is preserved
package day35;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> names=new TreeSet(Arrays.asList("Alice","Tom","Harry","Henry","Elcid","Jack"));
		System.out.println(names);
		
		
		Set<Integer> numbers=new TreeSet(Arrays.asList(10,50,30,20,40));
		System.out.println(numbers);
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(1,"Rahul",46.5);
		Student s3=new Student(45,"Rohit",68.5);
		
		Set<Student> studentsAttendance=new TreeSet(new RollNoComparator());
		studentsAttendance.add(s1);
		studentsAttendance.add(s2);
		studentsAttendance.add(s3);
		System.out.println(studentsAttendance);
		
		
		Set<Student> studentsResult=new TreeSet(new PerComparator());
		studentsResult.add(s1);
		studentsResult.add(s2);
		studentsResult.add(s3);
		System.out.println(studentsResult);
		
		Set<Student> studentsExamSeats=new TreeSet(new NameComparator());
		studentsExamSeats.add(s1);
		studentsExamSeats.add(s2);
		studentsExamSeats.add(s3);
		System.out.println(studentsExamSeats);
	}

}
