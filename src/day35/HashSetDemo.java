//no dplicate
//no order preserving
package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		List<String> names1=new ArrayList(Arrays.asList("Alice","Ben","Dom","Alice","Ben"));
		
		Set<String> names=new HashSet(Arrays.asList("Alice","Ben","Dom","Chris","Elcid"));
		
		Set<String> names2=new HashSet(names1);
		System.out.println(names2);

	}

}
