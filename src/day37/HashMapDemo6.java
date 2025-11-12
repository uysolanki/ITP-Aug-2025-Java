package day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapDemo6 {
public static void main(String[] args) {
	
	String sentance="Virat Kohli";
	sentance=sentance.replaceAll("\\s+", "").toLowerCase();
	System.out.println(sentance);
	Map<Character,Integer> hashmap=new HashMap();
	
	for(char n:sentance.toCharArray())
	{
		hashmap.put(n, hashmap.getOrDefault(n, 0)+1 );
	}
	
	System.out.println(hashmap);
	
}
}

/*
even :2
odd : 1
}*/