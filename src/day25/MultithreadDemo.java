package day25;

public class MultithreadDemo {

	public static void main(String[] args) {
		Alpha thread1=new Alpha("Roger");
		thread1.start();
		
		Numeric thread2=new Numeric();
		
		
		Thread tx=new Thread(thread2,"Peter");
		tx.start();
		
		for(char i='a';i<='z';i++)
			System.out.println("\t\t" +i);
		
//		System.out.println(Thread.currentThread().getName());  //thread-main
	}

	
}
