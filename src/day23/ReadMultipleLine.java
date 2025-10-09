package day23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLine {

	public static void main(String[] args) 
	{
		
		String fileName="myfolder/file1.txt";
		FileReader fr=null;
		int charCount=0;
		try 
		{
			String line=null;
			//fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(new FileReader(fileName));
			
			while((line=br.readLine())!=null)
			{
			System.out.println(line);
			charCount+=line.length();
			}
			
			
			fr.close();
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("number of chars is " +charCount);
	}

}
