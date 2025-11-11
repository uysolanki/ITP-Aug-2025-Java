package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(10,51,40,20,30));
		ListIterator<Integer> litr=numbers.listIterator();
		System.out.println(numbers);
		
		while(litr.hasNext())
		{
			if(litr.next()%2==1)
				litr.set(100);
		}
		
		System.out.println(numbers);
		
		
		
		List<String> cities=new ArrayList(Arrays.asList("Pune","Mumbai","Delhi","Jaipur"));	//length>5 with Apple"
		ListIterator<String> litr1=cities.listIterator();
		while(litr1.hasNext())
		{
			if(litr1.next().length() > 5)
				litr1.remove();
				//litr1.set("Apple");
		}
		
		System.out.println(cities);
		
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
	}

}
