package day23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLine2 {

	public static void main(String[] args) 
	{
		
		String fileName="myfolder/file1.txt";
		String search="lang";
		int totalWordCount=0;
		int charCount=0;
		try 
		{
			String line=null;
			//fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(new FileReader(fileName));
			
			while((line=br.readLine())!=null)
			{
			int ans=searchWord(line.toLowerCase(),search);
			totalWordCount+=ans;
			}
			
			
			br.close();
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Total occurance count " +totalWordCount);
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
