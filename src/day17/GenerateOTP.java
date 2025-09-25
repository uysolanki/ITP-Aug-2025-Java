package day17;

import java.util.Random;

public class GenerateOTP {

	public static int getOTP()
	{
		Random random=new Random(); 					//max               min		smallest 6 digit
		int randomNumber=random.nextInt(100000);		//99999             0       9865+100000         =109865
//		System.out.println(randomNumber);
		int otp= randomNumber+100000;
		return otp;
	}
}
