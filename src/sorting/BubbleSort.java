package sorting;

import common.CommandLineOutput;

/**
 * Created by abhishekbarla on 10/10/16.
 */
public class BubbleSort extends SortingRepository {

	public static int[] doBubbleSort(int[] inputArray){

		int[] array = new int[inputArray.length];

		//Making a copy of the inputArray to display the unsorted array as well, after sorting
		System.arraycopy(inputArray, 0, array, 0, inputArray.length);



		return array;
	}

	public static void main(String[] args){

		int[] unsortedArray = getRandomUnsortedArray();
		long startTime = System.nanoTime();
		int[] sortedArray = doBubbleSort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime - startTime;

		CommandLineOutput.sortingOutput("Bubble Sort", unsortedArray, sortedArray, sortingTime);
	}


}
