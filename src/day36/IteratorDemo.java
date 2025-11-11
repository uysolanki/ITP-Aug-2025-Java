package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(10,51,40,20,30));
		Iterator<Integer> itr=numbers.iterator();
		System.out.println(numbers);
		while(itr.hasNext())
		{
			if(itr.next()%2==1)
				itr.remove();
		}
		System.out.println(numbers);
	}

}
