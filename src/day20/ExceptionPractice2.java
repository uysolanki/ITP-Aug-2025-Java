package day20;

public class ExceptionPractice2 {

	public static void main(String[] args) {
		String sentance="my name is Alice i have 2.2 brothers and 1.5 sister I am 11 years old";
		
		String words[]=sentance.split(" ");
		System.out.println(words.length);
		int intCounter=0;
		int doubleCounter=0;
		int stringCounter=0;
		
		for(String word:words)
		{
			try
			{
				
			int n1=Integer.parseInt(word);
			intCounter++;
			}
			catch(NumberFormatException e1)
			{
				try
				{
				double n2=Double.parseDouble(word);
				doubleCounter++;
				}
				catch(NumberFormatException e2)
				{
					stringCounter++;
				}
			}
		}
		System.out.println("Number of Integers are "+intCounter);
		System.out.println("Number of Doubles are "+doubleCounter);
		System.out.println("Number of Strings are "+ stringCounter);
	}

}
