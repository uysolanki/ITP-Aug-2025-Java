package day34;

import java.util.Stack;

public class PlaindromeStringUsingStack {							//	m
																	//	a
	public static void main(String[] args) {						//  d
		String name="mymadam";										//	a
		Stack<Character> stack=new Stack();							//	m
		
		for(char ch:name.toCharArray())
			stack.push(ch);
		
		int flag=0;
		for(char ch:name.toCharArray())				//ch		s
		{											//m			m
			char s=stack.pop();
			if(ch!=s)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
