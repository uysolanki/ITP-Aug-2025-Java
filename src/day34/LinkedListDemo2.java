package day34;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<String> a1=new LinkedList<String>();
		a1.add("Alice"); //0
		a1.add("Ben");
		a1.add("Chris");
		a1.add("David");
		
		System.out.println(a1);
		
		
		a1.addFirst("Tom");
		a1.addLast("John");
		
		System.out.println(a1);
	}

}
