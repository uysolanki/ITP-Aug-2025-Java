package day14;

public class ShapeMain {

	public static void main(String[] args) {
		Shape s;
		
		s=new Circle();
		s.area();
		s.perimeter();

		s=new FootballField();
		s.area();
		s.perimeter();
	}

}
