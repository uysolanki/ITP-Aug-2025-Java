package day4;

import java.util.Scanner;

public class Student {

	private int rno;				//instance variable/scope
	private String sname;
	private double per;
	
	public void acceptStudent()
	{
		rno=18;
		sname="Virat";
		per=78.5;
	}
	
	public void acceptStudentFromUser()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Student rno");  //18
		this.rno=sc.nextInt();
		System.out.println("Please enter Student name");  //Virat
		this.sname=sc.next();
		System.out.println("Please enter Student percentage");  //78.5
		this.per=sc.nextDouble();
	}
	
	public void displyStudent()
	{
		System.out.println(this.rno + " " + this.sname + " " +this.per);
	}
	
	public void test()
	{
		Student s4=new Student();
		s4.displyStudent();
		s4.sname="Akash";
	}
}
