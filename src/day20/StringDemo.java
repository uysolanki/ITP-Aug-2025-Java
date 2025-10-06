package day20;

public class StringDemo {

	public static void main(String[] args) {
		String name="raj";
		try
		{
		System.out.println(name.charAt(3));	//new StringIndexOutOfBoundsException
		System.out.println("If exception occurs This line will be skipped");
		}
		catch(IndexOutOfBoundsException e1)
		{
			System.out.println(e1.getLocalizedMessage());
			//e1.printStackTrace();
		}
		finally  //clean up tasks
		{
		System.out.println("HI");
		}
	}

}