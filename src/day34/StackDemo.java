package day34;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> a1=new Stack<String>();			//LIFO
		a1.push("Alice"); //0
		a1.push("Ben");
		a1.push("Chris");
		
		
		System.out.println(a1.peek());			//size=3
		System.out.println(a1.size());
		
		
		System.out.println(a1.pop());			//size=2
		System.out.println(a1.size());
		
		

	}

}
