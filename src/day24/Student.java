package day24;

import java.io.Serializable;

public class Student implements Serializable
{
	private static final long serialVersionUID =1L;		
	private int rno;
	private String sname;
	private double per;

	transient int temp;
	
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

	
	
	
}
