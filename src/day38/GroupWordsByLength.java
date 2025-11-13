package day38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GroupWordsByLength {

	public static void main(String[] args) {
		String sentance="one two three four one five six seven";
		String arr[]=sentance.split(" "); //[one, two, three, four, one, five, six, seven]
		Map<Integer,Set<String>> hashmap=new HashMap();
		
		List<Set<String>> finalResult=new ArrayList();
		for(String word:arr)			//word = three
		{
			int key=word.length();		//key = 5
			hashmap.putIfAbsent(key, new HashSet());
			
			hashmap.get(key).add(word);
		}

		System.out.println(hashmap);
		
		for(Entry<Integer,Set<String>> entry:hashmap.entrySet())
		{
			finalResult.add(entry.getValue());
		}
		
		System.out.println(finalResult);
	}

}
/*
 
[[six, one, two],[four, five],[seven, three]]
start
{
3 : [one,two]	
5 : [three]	
}

finished:
3 : [one,two,six]
4 : [four,five]
5 : [seven,three]
*/