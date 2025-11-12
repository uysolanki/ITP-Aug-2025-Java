package day37;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo8FirstNonRepeatedCharinString2 {
public static void main(String[] args) {
	
	//String sentance="Virat Kohli";
	//String sentance="Virati traV";
	//String sentance="";
	String sentance=null;
	char result=findChar(sentance);
	if(result=='0')
		System.out.println("No char found");
	else if(result=='1')
		System.out.println("Invalid Input");
	else	
	System.out.println("First Non repeating char is "+result);
}

private static char findChar(String sentance) {
	if(sentance==null || sentance.length()==0)
		return '1';
	sentance=sentance.replaceAll("\\s+", "").toLowerCase();
	System.out.println(sentance);
	Map<Character,Integer> hashmap=new HashMap();
	
	for(char n:sentance.toCharArray())
	{
		hashmap.put(n, hashmap.getOrDefault(n, 0)+1 );
	}
	
	System.out.println(hashmap);
	for(char n:sentance.toCharArray())
	{
		if(hashmap.get(n) == 1)
			return n;
	}
	return '0';
}
}

/*
even :2
odd : 1
}*/