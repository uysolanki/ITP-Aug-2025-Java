package day25;

public class Numeric implements Runnable
{
	public Numeric() {}
//	public Numeric(String name)
//	{
//		super(name);
//	}
 @Override
public void run() {
	 System.out.println(Thread.currentThread().getName());
	 for(int i=1;i<=26;i++)
	 {
			System.out.println("\t"+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				
			}
	 }
}
}
