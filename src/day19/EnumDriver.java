package day19;

import java.util.Scanner;

public class EnumDriver {

	public static void main(String[] args) {
//		Weekday today;
//		today=Weekday.TUESDAY;
//		
//		System.out.println("Today is "+today);
//		
//		Direction car;
//		
//		car=Direction.EAST;
//		
//		System.out.println("Car is moving in "+car+ " Direction");
//		
//		
//		Planet planet;
//		
//		planet=Planet.JUPITER;
//		
//		System.out.println(planet + " Radius is "+planet.getRadius());
//		System.out.println(planet + " Mass is "+planet.getMass());
//		
//		System.out.println(planet + " Gravity is " + planet.gravity());
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter Username");
		String username=sc.next();
		
		System.out.println("Please enter Password");
		String password=sc.next();
		
		AppErrors error=null;
		if(username.length()<3)
		{
			error=AppErrors.ERR1;
			System.out.println(String.format(error.getErrorMessage(), username));
		}
		
		if(password.length()<6)
		{
			error=AppErrors.ERR2;
			System.out.println(error.getErrorMessage());
		}
		
		
	}

}
