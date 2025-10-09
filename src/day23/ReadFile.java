package day23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) 
	{
		
		String fileName="myfolder/file1.txt";
		FileReader fr=null;
		try 
		{
			fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			
			String line=br.readLine();
			System.out.println(line);
			System.out.println("number of chars is " +line.length());
			fr.close();
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
