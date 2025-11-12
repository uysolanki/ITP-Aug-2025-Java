package day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapDemo3 {
public static void main(String[] args) {
	
	int arr[]= {10,11,12,13,14};
	//count of odd and even elements
	
	Map<String,Integer> hashmap=new HashMap();
	hashmap.put("even",0);
	hashmap.put("odd",0);
	for(int n:arr)
	{
		if(n%2==0)
		{
			hashmap.put("even", hashmap.get("even")+1);
		}
		else
		{
			hashmap.put("odd", hashmap.get("odd")+1);
		}
	}
	
	System.out.println(hashmap);
	
}
}

/*
even :1
odd: 0
}*/