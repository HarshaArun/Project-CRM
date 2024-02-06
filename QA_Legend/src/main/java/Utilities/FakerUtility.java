package Utilities;

import java.util.Random;

public class FakerUtility {
	
	
	public static int randomNumberCreation()    //used to generate random numbers to avoid duplication of test data(e.g along with title,id,.... )
	{
		Random random= new Random();
		int random_number= random.nextInt(10000);
		return random_number;
	}

}
