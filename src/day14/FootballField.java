package day14;

public class FootballField extends Rectangle
{

	@Override
	public void perimeter() {
		int length=10;
		int breadth=5;
		int result=2*(length + breadth);
		System.out.println("Perimeter of Rectangle is" +result);
	}

}
