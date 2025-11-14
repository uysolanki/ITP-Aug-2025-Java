package day39;

public class DriverApp4 {

	public static void main(String[] args) {
		
		Arithmetic arithmetic=(n1,n2)->n1+n2;
		
		double ans=arithmetic.add(10, 5);
		System.out.println(ans);
		
		
		Arithmetic arithmetic1=(n1,n2)->{
			return n1+n2;
		};
		
		double ans1=arithmetic1.add(11, 9);
		System.out.println(ans1);

	}

}


/*
public interface Arithmetic {
double add(int num1,int num2);
}

*/