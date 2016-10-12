package sorting;

import common.CommandLineOutput;

/**
 * Created by abhishekbarla on 10/10/14.
 * Insertion Sort Implementation (in-place)
 */
public class InsertionSort extends SortingRepository{


	public static int[] doInsertionSort(int[] inputArray){

		int[] array = new int[inputArray.length];

		//Making a copy of the inputArray to display the unsorted array as well, after sorting
		System.arraycopy(inputArray, 0, array, 0, inputArray.length);

		int key = 0;
		int i = 0;

		// Loop through the entire array from the key
		for(int j=1; j<array.length; j++)
		{
			key = array[j];
			i = j-1;

			//Shifting if key is less than previous number
			while(i>=0 && array[i]>key)
			{
				array[i+1] = array[i];
				i = i-1;
			}
			array[i+1] = key;
		}
		return array;
	}

	public static void main (String args[]){

		int[] unsortedArray = getRandomUnsortedArray();
		long startTime = System.nanoTime();
		int[] sortedArray = doInsertionSort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime-startTime;

		CommandLineOutput.sortingOutput("Insertion Sort", unsortedArray, sortedArray, sortingTime);

	}
}
