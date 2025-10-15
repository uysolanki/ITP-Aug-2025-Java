package day26;

public class Dry extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t\tDRY "+ i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e1) {
				
			}
		}
	}
}
