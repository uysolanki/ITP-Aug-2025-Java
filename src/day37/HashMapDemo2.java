package day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapDemo2 {
public static void main(String[] args) {
	Map<String,Student> m100=new HashMap();
	m100.put("first" , new Student(18,"Virat",78.5));
	m100.put("second" , new Student(1,"Rahul",87.5));
	m100.put("third" , new Student(45,"Rohit",68.5));
	
	
	Map<String,Student> m200=new HashMap();
	m200.put("first" , new Student(4,"Abhishek",78.9));
	m200.put("second" , new Student(16,"Rishab",65.5));
	m200.put("third" , new Student(17,"Abd",87.4));
	
	List<Map<String,Student>> olympic=new ArrayList();
	olympic.add(m100);
	olympic.add(m200);
	
	System.out.println(olympic);
	
	//display name of the student who has come third in 200m
	
	//System.out.println(olympic.get(1).get("third").getSname());
	
	//display name of the student who has come first in the races
	
	for(Map<String,Student> races : olympic)
		System.out.println(races.get("first").getSname());
}
}


/*
[
{
"first" : new Student(18,"Virat",78.5);
"second" :new Student(1,"Rahul",87.5);
"third" :new Student(45,"Rohit",68.5);
},


]
*/