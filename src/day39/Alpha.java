package day39;

public class Alpha implements Runnable
{

	@Override
	public void run() {
		for(char i='A';i<='Z';i++)
			System.out.println("\t" +i);
	}

}
