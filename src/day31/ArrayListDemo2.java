package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(10,50,40,20,30));
		System.out.println(numbers);
		
		if(numbers.contains(40))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		List<String> names=new ArrayList(Arrays.asList("Alice","Ben","Chris"));
		System.out.println(names);
	}

	
}
