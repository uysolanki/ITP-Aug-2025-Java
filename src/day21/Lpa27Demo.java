package day21;

public class Lpa27Demo {

	public static void main(String[] args) {
		
		int ans=demo();
		System.out.println(ans);

	}

	private static int demo() {
		try
		{
			double result=10/0;
			return 1;
		}
		catch(ArithmeticException e1)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
		
	}

}
