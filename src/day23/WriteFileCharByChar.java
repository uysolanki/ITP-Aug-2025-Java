package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileCharByChar {

	public static void main(String[] args) 
	{
		
		String inputfileName="myfolder/file1.txt";
		String outputfileName="myfolder/file2.txt";
		try
		{
			FileInputStream fis=new FileInputStream(inputfileName);
			FileOutputStream fos=new FileOutputStream(outputfileName);
			int n;
//			do
//			{
//			n=fis.read();								
//			char ch=(char)n;
//			if((n>=65 && n<=90)||(n>=97 && n<=122)||(n==32)||(ch=='\n' || n==13))
//			{
//			fos.write(n);
//			}
//			else
//			{	
//			if(n!=-1)	
//			fos.write(64);	
//			}
//			
//			}while(n!=-1);
//			
			
			
			
			
			while((n = fis.read()) != -1) 
			{
			    char ch = (char) n;
			    if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122) || (n == 32) || (n == 13 || ch=='\n'))
			        fos.write(n);
			    else
			        fos.write(64);
			}

			
			fis.close();
			fos.close();
			System.out.println("File Copied");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
