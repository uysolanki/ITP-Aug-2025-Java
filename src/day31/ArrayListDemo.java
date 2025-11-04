package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Alice"); //0
		a1.add("Ben");
		a1.add("Chris");
		System.out.println("ISEMPTY " + a1.isEmpty());  //false
		System.out.println("SIZE = " + a1.size()); //3
		//if(size>0) element is present
		//if(size==0) no element present
		
		System.out.println(a1);		//[Alice,Ben,Chris]
		a1.add(2, "David");
		System.out.println(a1);     //[Alice,Ben,David,Chris]

		a1.remove("Ben");		
		System.out.println(a1);  	//[Alice,David,Chris]
		
		a1.remove(1);
		System.out.println(a1);  	//[Alice,Chris]
		
		System.out.println("SIZE = " +a1.size()); //2
		
		a1.clear();             //[]
		System.out.println("SIZE = " +a1.size()); //0
		
		
		System.out.println("ISEMPTY " + a1.isEmpty()); //true
		
		
		
			
	}

}
