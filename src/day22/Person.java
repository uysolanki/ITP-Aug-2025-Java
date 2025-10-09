package day22;

import java.io.IOException;

public class Person {
	
	protected int adharNo;				//total instance vars=3
	protected String name;
	protected int age;
	
	public Person() {					//no constructor has initialised 3 vars
		this.adharNo=1122;
		this.name="Rahul";
		this.age=21; //?
	}
	
	public Person(int adharNo, String name, int age) //all args constructor taking 3 parameters and has initialised 3 vars
	{
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
	}

	public int getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	void display() throws IOException
	{
		System.out.println("Adhar No is "+this.adharNo);
		System.out.println("Name is "+this.name);
		System.out.println("Age is "+this.age);
	}
	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed");
	}

	
}
