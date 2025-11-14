package day39;

public class DriverApp3 {

	public static void main(String[] args) {
//		Circle circle=(rad)->System.out.println(3.14*rad*rad);
//		circle.area(6);
//		
//		Rectangle rect=(len,br)->System.out.println(2*(len+br));
//		rect.perimeter(5, 6);
//		
//		Triangle triangle=(h,b)-> 3.14*h+b;
//		
//		double ans=triangle.volume(5, 3);
//		System.out.println(ans);
//		
		
//		Circle circle1=(rad)->
//			System.out.println(3.14*rad*rad);
//		
//		circle1.area(10);
//		
		
		Triangle triangle= (h,b)->{
			System.out.println("Hi There");
			return 3.14*h+b;	
		};
		double ans=triangle.volume(5, 3);
		System.out.println(ans);
		
		
		Circle circle=rad->System.out.println(3.14*rad*rad);
		circle.area(6);
		
	}

}
