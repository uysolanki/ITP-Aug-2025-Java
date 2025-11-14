package day39;

public class DriverApp5 {

	public static void main(String[] args) {
		
		Runnable numericThread=()->{
					for(int i=1;i<=26;i++)
						System.out.println(i);
		};
		
		
		Runnable alphaThread=()->{
			for(char i='A';i<='Z';i++)
				System.out.println("\t" +i);
		};
		
		Thread tx1=null;
		tx1=new Thread(numericThread);
		tx1.start();
		
		tx1=new Thread(alphaThread);
		tx1.start();

	}

}
