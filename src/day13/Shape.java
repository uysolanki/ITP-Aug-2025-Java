package day13;

public class Shape {

	//circle
	public double area(int radius)						//function overloading
	{
		return Math.PI*radius*radius;
	}
	
	
	
	//rectangle
	public double area(int length,int breadth)
	{
		return length*breadth;
	}
}
