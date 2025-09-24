package day13;

public class ShapeMain {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(10,20);  //early binding, compile time poly
		s.area(5);
	}

}
