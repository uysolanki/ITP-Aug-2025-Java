package day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCharByChar {

	public static void main(String[] args) 
	{
		
		String fileName="myfolder/file1.txt";
		try
		{
			FileInputStream fis=new FileInputStream(fileName);
			int n;
			do
			{
			n=fis.read();									//n			ch					o/p
			char ch=(char)n;								//70		F					Fu
			System.out.print(ch);							//117       u
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
