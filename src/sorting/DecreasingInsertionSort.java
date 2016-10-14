package sorting;

import util.CommandLineOutput;
import util.CommonUtility;

/**
 * Created by abhishekbarla on 10/12/16.
 * Insertion Sort to sort in decreasing order (In-place)
 */
public class DecreasingInsertionSort {

	public static int[] doReverseInsertionSort (int[] inputArray) {

		int[] array = new int[inputArray.length];

		//Making a copy of the inputArray to display the unsorted array as well, after sorting
		System.arraycopy(inputArray, 0, array, 0, inputArray.length);

		//Insertion Sort to sort in decreasing order
		int i =0;
		int key = 0;
		for(int j=1; j<array.length; j++)
		{
			key = array[j];
			i = j-1;

			while(i>-1 && array[i]<key)
			{
				array[i+1] = array[i];
				i--;
			}
			array[i+1] = key;
		}

		return array;

	}

	public static void main(String[] args){

		int[] unsortedArray = CommonUtility.randomArrayGenerator();
		long startTime = System.nanoTime();
		int[] sortedArray = doReverseInsertionSort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime - startTime;

		CommandLineOutput.sortingOutput("Decreasing Insertion Sort", unsortedArray, sortedArray, sortingTime);
	}

}
