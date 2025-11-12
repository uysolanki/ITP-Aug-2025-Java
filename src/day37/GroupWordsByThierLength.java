package day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupWordsByThierLength {
public static void main(String[] args) {
	
	String sentance="one two three four five six seven";
	String arr[]=sentance.split(" "); //[My, name, is, Alice, Pune, is, a, good, city]
	
	Map<String,Integer> hashmap=new HashMap();
	
	for(String n:arr)
	{
		hashmap.put(n, hashmap.getOrDefault(n, 0)+1 );
	}
	
	System.out.println(hashmap);
	
}
}

/*
3 : [one,two,six]
4 : [four,five]
5 : [seven,three]


[[one,two,six],[four,five],[seven,three]]
}*/