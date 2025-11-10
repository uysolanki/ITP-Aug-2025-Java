//no duplicates
//but insertion order is preserved
package day35;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> names=new LinkedHashSet(Arrays.asList("Alice","Ben","Dom","Chris","Elcid","Chris"));
		System.out.println(names);

	}

}
