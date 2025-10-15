package day26;

public class Alpha extends Thread
{
	public Alpha() {}
	public Alpha(String name)
	{
		super(name);
	}
	

	@Override
	public void run() {
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
		}
	}
	
	
}
