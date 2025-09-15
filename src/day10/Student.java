package day10;

public class Student {
		private int rno;
		private String sname;
		private double per;
		
		public Student()		//NoArgsConstructor
		{
			this.rno=18;
			this.sname="Virat";
			this.per=78.5;
		}
		
		public Student(int a,String b,double c)		// Parameterised Constructor
		{
			this.rno=a;
			this.sname=b;
			this.per=c;
		}
		
		public Student(Student stud)		// Copy Constructor
		{
			this.rno=stud.rno;
			this.sname=stud.sname;
			this.per=stud.per;
		}
		@Override
		public String toString() {
			return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
		}
		
		
}
