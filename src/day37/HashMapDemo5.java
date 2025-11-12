package day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapDemo5 {
public static void main(String[] args) {
	
	String sentance="My name is Alice Pune is a good city";
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
even :2
odd : 1
}*/