package day24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjectToFile {

	public static void main(String[] args) throws IOException {
	
	String fileName="myfolder/file3.txt";
	Student s1=new Student(18,"Virat",78.5);
	
	FileOutputStream fos=new FileOutputStream(fileName);
	
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	oos.writeObject(s1);
	fos.close();
	oos.close();
	
	System.out.println("Object Written to file");

	}

}
