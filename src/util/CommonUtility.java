package util;

import java.util.Random;

/**
 * Created by abhishekbarla on 10/14/16.
 * Contains commonly used functions in the project
 */
public class CommonUtility {

	public static int[] swap(int number1, int number2, int[] array){

		int temp = array[number1];
		array[number1] = array[number2];
		array[number2] = temp;

		return array;
	}

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


