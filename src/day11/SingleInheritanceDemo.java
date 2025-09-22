package day11;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
	Employee e1=new Employee();		//no args
	//System.out.println(e1);
	
	Employee e2=new Employee(7788, "Abhishek", 21,102,"Programmer",900.0);
	e2.displayEmployee();
	
	}

}
