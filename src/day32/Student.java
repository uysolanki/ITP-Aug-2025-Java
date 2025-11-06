package day32;

import java.io.Serializable;

public class Student implements Serializable
{
	private int rno;
	private String sname;
	private double per;
    Address address;
    
	public Student()		
	{
		this.rno=18;
		this.sname="Virat";
		this.per=78.5;
		this.address=new Address(15,"Flat","Pune");
		
	}
	
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;	
	}
	public Student(int rno, String sname, double per, Address address) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
		this.address=address;
		
	}

	
	

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + ", address=" + address + "]";
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
