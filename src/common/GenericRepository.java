package common;

import java.util.Random;

/**
 * Created by abhishekbarla on 10/10/16.
 */
public class GenericRepository {

	public static int[] randomArrayGenerator(){
		int[] array = new int[Constants.maxRandomArraySize];
		Random randomNumberGenerator = new Random();

		for(int i=0; i<Constants.maxRandomArraySize; i++)
		{
			array[i] = randomNumberGenerator.nextInt(Constants.highestRandomNumber);
		}

		return array;
	}
}
