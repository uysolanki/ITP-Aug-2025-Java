package day6;

public class RecursionDemo {

	public static void main(String[] args) {
	int ans=sum(5);
	System.out.println(ans);
	}

	private static int sum(int n) {
		if(n==1)
			return 1;
		else
			return n+sum(n-1);
	}

}
