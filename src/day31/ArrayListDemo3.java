package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune","Nashik","Mumbai"));
		List<String> rj = new ArrayList(Arrays.asList("Jaipur","Bikaner","Jodhpur"));
		List<String> gj = new ArrayList(Arrays.asList("Surat","Ahmedabad","Gandhinagar"));
		
		List<String> India = new ArrayList();
		
		India.addAll(rj);
		India.addAll(mh);
		India.addAll(gj);
		
		System.out.println(India);	
		System.out.println(India.size());		//9
		
		//India.removeAll(mh);					
		India.retainAll(mh);
		System.out.println(India);				//6
		System.out.println(India.size());

	}

}
