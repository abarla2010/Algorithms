package searching;

import common.CommandLineOutput;
import common.Constants;
import repository.SearchingRepository;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by abhishekbarla on 10/12/16.
 * Linear Search Algorithm to find if a key exists in a random array. If the key exists, then the algorithm returns the
 * position of the key in the array
 */
public class LinearSearch extends SearchingRepository {

	public static ArrayList doLinearSearch(int key, int[] inputArray){

		ArrayList index = new ArrayList();

		// Loop through the whole array for the key
		for(int i=0; i<inputArray.length; i++){
			if(key == inputArray[i]){
				index.add(i);
			}
		}
		//If the key wasn't found in the array
		if(index.size()==0)
		index.add(-1);

		return index;
	}

	public static void main(String[] args){

		int[] searchArray = getRandomUnsortedArray();
		int key = 0;

		Random random = new Random();
		key = random.nextInt(Constants.highestRandomNumber);
		long startTime = System.nanoTime();
		ArrayList index = doLinearSearch(key, searchArray);
		long endTime = System.nanoTime();
		long searchingTime = endTime-startTime;

		CommandLineOutput.searchingOutput("Linear Search", index, key, searchArray, searchingTime);
	}

}
