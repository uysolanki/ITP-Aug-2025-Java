package day39;

public class ThreadMainDriver {

	public static void main(String[] args) {
//		Alpha thread1=new Alpha();
//		Numeric thread2=new Numeric();
//		
//		Thread tx=new Thread(thread1);
//		tx.start();
		
		Runnable runnable1=()->{
			for(char i='A';i<='Z';i++)
				System.out.println("\t" +i);	
		};
		
		Runnable runnable2=()->{
			for(int i=1;i<=26;i++)
				System.out.println(i);
		};
		
		Thread tx1=new Thread(runnable1);
		tx1.start();
		
		Thread tx2=new Thread(runnable2);
		tx2.start();

	}

}
