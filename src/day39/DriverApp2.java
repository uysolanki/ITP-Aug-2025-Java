package day39;

public class DriverApp2 {

	public static void main(String[] args) {
		Sample sample=(name)->System.out.println("Welcome " + name + " to Pune for FSD course");
		sample.greet("Ben");
		sample.greet("Chris");
		sample.greet("David");
	}
}
