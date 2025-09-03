package day4;

import java.util.Scanner;

public class StudentArrayOfObject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter batch strength");
		int size=sc.nextInt();
		Student batch[]=new Student[size];
		
		for(int i=0;i<batch.length;i++)			//i
		{										//0
		batch[i]=new Student();
		}
		
		for(int i=0;i<batch.length;i++)			//i
		{										//0
		batch[i].acceptStudentFromUser();
		}
		
		for(int i=0;i<batch.length;i++)			//i
		{										//0
		batch[i].displyStudent();
		}
	}

}
