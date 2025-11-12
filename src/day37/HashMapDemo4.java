package day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapDemo4 {
public static void main(String[] args) {
	
	int arr[]= {10,11,12,13,14};
	//count of odd and even elements
	
	Map<String,Integer> hashmap=new HashMap();
	
	for(int n:arr)
	{
		if(n%2==0)
		{
			hashmap.put("even", hashmap.getOrDefault("even", 0)+1 );
		}
		else
		{
			hashmap.put("odd", hashmap.getOrDefault("odd", 0)+1 );
		}
	}
	
	System.out.println(hashmap);
	
}
}

/*
even :2
odd : 1
}*/