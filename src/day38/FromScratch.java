package day38;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FromScratch {

	public static void main(String[] args) {
		String sentance="one two three four five six";
		System.out.println(sentance);
		Collection<Set<String>> ans=findGroups(sentance);
		System.out.println(ans);
	}

	private static Collection<Set<String>> findGroups(String sentance) {
		String arr[]=sentance.split(" ");
		System.out.println(Arrays.toString(arr));
		
		Map<Integer,Set<String>> hashmap=new HashMap();
		for(String word:arr)		//word : one
		{
			int key=word.length();	//key : 3
			hashmap.putIfAbsent(key, new HashSet());
			
			hashmap.get(key).add(word);
		}
		
		System.out.println(hashmap);
		System.out.println(hashmap.keySet());
		return(hashmap.values());
	}

}

/*
 {
 3 : [six, one, two]
 4 : [four, five]
 5 : [seven, three]
 }
 
 [[six, one, two],[four, five],[seven, three]]
 */
