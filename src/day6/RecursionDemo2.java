package day6;

public class RecursionDemo2 {

	public static void main(String[] args) {
	int ans=fact(5);
	System.out.println(ans);
	}

	private static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}

}
