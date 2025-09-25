package day14;

public class Circle implements Shape
{

	@Override
	public void area() {
		int radius=5;
		double result=PI*radius*radius;
		System.out.println("Area Of Circle is "+result);
		
	}

	@Override
	public void perimeter() {
		int radius=5;
		double result=PI*radius;
		System.out.println("Perimeter Of Circle is "+result);
		
	}

}
