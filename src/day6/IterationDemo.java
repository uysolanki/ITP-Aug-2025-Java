package day6;

public class IterationDemo {

	public static void main(String[] args) {
	sum();
	}

	private static void sum() {
		int sum=0;
		int i;
		for(i=1;i<=5;i++)
			sum+=i;
		
		System.out.println(sum);
	}

}
