package day11;

public class Employee extends Person
{

	protected int eno;			//total 6
	protected String desg;
	protected double sal;
	
	
	public Employee()
	{
		super();   //no args constructor of the super class Person
		this.eno=101;
		this.desg="Manager";
		this.sal=8000.0;
	}
	
	public Employee(int adharNo, String name, int age,int eno,String desg,double sal)
	{
		super(adharNo,name,age); //Parameterised constructor of the super class Person
		this.eno=eno;
		this.desg=desg;
		this.sal=sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", desg=" + desg + ", sal=" + sal + ", adharNo=" + adharNo + ", name=" + name
				+ ", age=" + age + "]";
	}

	
	
	
}
