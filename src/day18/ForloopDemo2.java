package day18;

public class ForloopDemo2 {

	public static void main(String[] args) {
		
		Student s1;
		
		s1=new Student(18,"Virat",80);
		Student s2=new Student(45,"Rohit",90);
		Student s3=new Student(63,"Surya",70);
		
		
		Student batch[];
		
		batch=new Student[3];
		batch[0]=s1;
		batch[1]=s2;
		batch[2]=s3;
		
		double totPer=0.0;
		for(Student student:batch)
		{
			System.out.println(student.getSname() + " is my friend");
			totPer+=student.getPer();
		}
		
		double avgPer=totPer/batch.length;
		System.out.println("Total Percentage is "+totPer);
		System.out.println("Average Percentage is "+avgPer);
		}

}

//length    length()
//number at position 1 is 10
//number at position 2 is 20
//number at position 1 is 10
//number at position 1 is 10
//number at position 1 is 10