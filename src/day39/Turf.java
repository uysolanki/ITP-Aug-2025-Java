package day39;

@FunctionalInterface
public interface Turf {
	public double getPrice();

	public default String getCompanyName()
	{
		return "Kannade";
	}
	
	public default String getCompanyName1()
	{
		return "Kannade";
	}
	
	public static String getCityName()
	{
		return "Pune";
	}
	
	public static String getCityName1()
	{
		return "Pune";
	}
}
