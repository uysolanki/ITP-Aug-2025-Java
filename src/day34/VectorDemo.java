package day34;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> names = new Vector();		//No Args Constructor 
													//default capacity = 10
													//default increment = double
		
		System.out.println("Capacity " +names.capacity());
		
		for(int i=1;i<=10;i++)
			names.add("Alice");
		
		System.out.println("Size " +names.size());			//size=10
		System.out.println("Capacity " +names.capacity());  //capacity=10 
		
		names.add("Alice");									
		
		System.out.println("Size " +names.size());			//size=11
		System.out.println("Capacity " +names.capacity());	//capacity=20
		
		
		Vector<String> names1 = new Vector(5);			//user defined capacity 5
														//default increment = double
		
		for(int i=1;i<=6;i++)
			names1.add("Alice");
		
		System.out.println("Size " +names1.size());				//size=6
		System.out.println("Capacity " +names1.capacity());		//capacity=10
		
		for(int i=1;i<=5;i++)
			names1.add("Alice");
		
		System.out.println("Size " +names1.size());				//size=11
		System.out.println("Capacity " +names1.capacity());		//capacity=20
		
		
		Vector<String> names2 = new Vector(5,3);			//user defined capacity 5
															//user defined increment 3
		
		for(int i=1;i<=6;i++)
			names2.add("Alice");
		
		System.out.println("Size " +names2.size());				//size=6
		System.out.println("Capacity " +names2.capacity());		//capa = 8
		
		
		List<Integer> numbers=new ArrayList();
		
		Vector<Integer> names3 = new Vector(numbers);
	}

}
