package day23;

public class FindWordInAFile {

	public static void main(String[] args) {
		String str="full stack is a stack of technology";
		String search="stack1";
		int counter=0;
		int startIndex=0;
		int index;
		
		int ans=searchWord(str,search);
		System.out.println(ans);
	}
	
	
	public static int searchWord(String str,String search)
	{
		int counter=0;
		int startIndex=0;
		int index;
		
		do
		{
		index=str.indexOf(search,startIndex);
		
			if(index!=-1)
			{
			counter++;
			startIndex=index+search.length();
			}
		
		}while(index!=-1);
		
		return counter;
	}

}
