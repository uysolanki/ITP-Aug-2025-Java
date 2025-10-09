package day23;

import java.io.File;

public class CreateFile {
public static void main(String[] args) {
	
	File file=new File("myfolder");
	
	if(!file.exists())
	{
		file.mkdir();
	}
	
	System.out.println("Folder Created");
}
}
