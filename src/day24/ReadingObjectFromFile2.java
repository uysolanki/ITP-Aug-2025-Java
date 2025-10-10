package day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import day10.Student;
public class ReadingObjectFromFile2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	String fileName="myfolder/file3.txt";
	Student s1=null;
	
	FileInputStream fis=new FileInputStream(fileName);
	
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	s1=(Student)ois.readObject();
	fis.close();
	ois.close();
	
	System.out.println(s1);

	}

}
