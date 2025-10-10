package day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCharByChar2 {

	public static void main(String[] args) 
	{
		
		String fileName="myfolder/file1.txt";
		try
		{
			FileInputStream fis=new FileInputStream(fileName);
			int n;
			do
			{
			n=fis.read();								
			char ch=(char)n;
			if(Character.isLetter(ch) || Character.isSpaceChar(ch) || ch=='\n')
			{
			System.out.print(ch);
			}
			else
			System.out.print("@");	
			
			}while(n!=-1);
			
			fis.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
