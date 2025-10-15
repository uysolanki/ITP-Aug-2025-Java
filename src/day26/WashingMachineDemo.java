package day26;

public class WashingMachineDemo {

	public static void main(String[] args) throws InterruptedException {
		Soak thread1=new Soak();
		Wash thread2=new Wash();
		Dry thread3=new Dry();
		
		thread1.start();
		thread1.join(4000,10);
		thread2.start();
		thread2.join();
		thread3.start();

	}

}
