package day26;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Alpha thread1=new Alpha("Mike");
		Numeric thread2=new Numeric("Peter");
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();

//		System.out.println("OLD Thread 1 Priority " +thread1.getPriority());
//		
//		
//		//thread1.setPriority(10);
//		
//		
//		System.out.println("NEW Thread 1 Priority " +thread1.getPriority());
	}

}
