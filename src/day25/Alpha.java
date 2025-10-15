package day25;

public class Alpha extends Thread
{
	public Alpha() {}
	public Alpha(String name)
	{
		super(name);
	}
	
	@Override
	public void start()
	{
		System.out.println("Hi");
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
//			try 
//			{
//				Thread.sleep(5000);
//			} 
//			catch (InterruptedException e) 
//			{
//				
//			}
		}
	}
	
	public void run(int n)
	{
		
	}
	
}
