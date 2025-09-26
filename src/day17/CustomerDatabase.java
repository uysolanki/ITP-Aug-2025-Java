package day17;

public class CustomerDatabase {

	public static Customer2[] getAllCustomers()
	{
		Customer2 customer1=new Customer2("virat@gmail.com","Virat123");
		Customer2 customer2=new Customer2("rohit@gmail.com","Rohit123");
		Customer2 customer3=new Customer2("hardik@gmail.com","Hardik123");
		Customer2 customer4=new Customer2("surya@gmail.com","Surya123");
		
		
		Customer2 customers[]=new Customer2[4];
		
		customers[0]=customer1;
		customers[1]=customer2;
		customers[2]=customer3;
		customers[3]=customer4;
		
		return customers;
	}
}
