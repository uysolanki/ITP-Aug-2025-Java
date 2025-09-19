package day11;

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

	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

	
}
