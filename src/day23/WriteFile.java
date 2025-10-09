package day23;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException  {
		
		String fileName="myfolder/file1.txt";
		
		FileWriter fr=new FileWriter(fileName,true);
		//fr.write("Full Stack");
		fr.append(" Developer");
		fr.close();
		System.out.println("Data Written to File");
		
	}

}
