package day34;

import java.util.Stack;

public class WellFormedParenthesis {

	public static void main(String[] args) {
		String input="}[]}";
		if(input.length()%2==0)
		{
		boolean result=checkParenthesis(input);
		if(result)
			System.out.println("Wellformed");
		else
			System.out.println("Not Wellformed");
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

	private static boolean checkParenthesis(String input) {
		Stack<Character> stack=new Stack();
																		//
		for(char a:input.toCharArray())				//a					//
		{																//
			if(a=='{' || a=='[' || a== '(')
			{
				stack.push(a);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char b;
			switch(a)
			{
			case ')' : 		b=stack.pop();
							if(b!='(')
								return false;
							break;
							
			case ']' : 		b=stack.pop();
							if(b!='[')
								return false;
							break;
			
			case '}' : 		b=stack.pop();
							if(b!='{')
								return false;
							break;
			}	
		}
		
		return stack.isEmpty();
	}

}
