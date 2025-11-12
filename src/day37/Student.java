package day37;

public class Student // implements Comparable<Student>
{
	private int rno;
	private String sname;
	private double per;
  
    
	public Student()		
	{
		this.rno=18;
		this.sname="Virat";
		this.per=78.5;

	}
	
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;	
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

//	@Override
//	public int compareTo(Student s2) 
//	{
////		if(this.getRno()>s2.getRno())				//rollno in asc order
////			return 1;
////		else if(this.getRno()<s2.getRno())
////			return -1;
////		else
////			return 0;
//		
//		
////		if(this.getPer()<s2.getPer())				//per desc order
////			return 1;
////		else if(this.getPer()>s2.getPer())
////			return -1;
////		else
////			return 0;
//		
//		return this.getSname().compareTo(s2.getSname());
//	}
}
