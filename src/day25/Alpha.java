package day25;

public class Alpha extends Thread
{
	@Override
	public void run() {
		for(char i='A';i<='Z';i++)
			System.out.println("\t" +i);
	}
	
}
