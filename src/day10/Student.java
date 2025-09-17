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
		
		public Student(int a,double c,String b)		// Parameterised Constructor
		{
			this.rno=a;
			this.sname=b;
			this.per=c;
		}
		
		public Student(Student stud)		// Copy Constructor
		{
			stud.rno=333;
			this.rno=stud.rno;
			this.sname=stud.sname;
			this.per=stud.per;
		}
		
		@Override
		public String toString() {
			return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
		}

		public int getRno() {
			return rno;
		}

		public void setRno(int rno) {
			this.rno = rno;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public double getPer() {
			return per;
		}

		public void setPer(double per) {
			this.per = per;
		}
		
		
}
