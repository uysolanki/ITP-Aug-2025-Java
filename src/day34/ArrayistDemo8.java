package day34;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayistDemo8 {

	public static void main(String[] args) {
														//NoArgsConstructor
		List<Integer> numbers=new ArrayList();			//default capacity = 10
														//size = 0
		
		List<Integer> numbers1=new ArrayList(50);		//ParaConstructor
														//user defined capacity = 50
														//size
		
		List<Integer> numbers2=new LinkedList();			//ParaConstructor
												
		List<Integer> numbers3=new ArrayList(numbers2);	
	}

}
