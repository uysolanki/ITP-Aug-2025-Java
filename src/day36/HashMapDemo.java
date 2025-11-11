package day36;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Double> emps=new HashMap();
		emps.put("Alice", 800.0);
		emps.put("Ben", 900.0);
		emps.put("Chris", 1000.0);
		emps.put("Ben", 999.0);
		emps.put("ben", 1999.0);
		
		System.out.println(emps);
		
		System.out.println("Ben".hashCode());
		System.out.println("ben".hashCode());
		double sum=0;
		for(Entry<String,Double> emp:emps.entrySet())
		{
			sum+=emp.getValue();
		}
		System.out.println(sum);
	}

}
