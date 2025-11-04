package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune","Nashik","Mumbai"));  //0,1,2,3,4
		List<String> rj = new ArrayList(Arrays.asList("Jaipur","Bikaner","Jodhpur"));
		
		mh.add("Nagpur");  //1 add occupies 1 index
		mh.add("Satara");
		
		List <List<String>> India = new ArrayList();
		India.add(mh);
		India.add(rj);
		
		System.out.println(India); //[["Pune","Nashik","Mumbai"],["Jaipur","Bikaner","Jodhpur"]]
		System.out.println(India.size());
		
		//display 1st city of each state in India
		//Output : Pune
		//         Jaipur
		
		for(int i=0;i<India.size();i++)
		{
			System.out.println(India.get(i).get(0));
		}
		
		
		
		
	}

}
