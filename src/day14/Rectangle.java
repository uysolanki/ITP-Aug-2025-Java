package day14;

public abstract class Rectangle implements Shape
{

	@Override
	public void area() {
		int length=10;
		int breadth=5;
		
		int result=length*breadth;
		System.out.println("Area of Rectangle is "+result);
		
	}
}
