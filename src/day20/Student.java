package day20;

import java.util.Scanner;
import static java.lang.Math.*;

public class Student {
				
	private String sname;
	
	public Student(String sname) throws Exception
	{
		if(sname=="" ||sname==null)
			throw new Exception("Invalid Name");
		this.sname=sname;
	}
	

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	
	
	
	
	
}
