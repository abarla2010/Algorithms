package sorting;

import util.CommandLineOutput;
import util.CommonUtility;

import static util.CommonUtility.swap;

/**
 * Created by abhishekbarla on 10/10/16.
 */
public class BubbleSort {

	public static int[] doBubbleSort(int[] inputArray){

		int temp = 0;
		boolean flag = true;
		int[] array = new int[inputArray.length];

		//Making a copy of the inputArray to display the unsorted array as well, after sorting
		System.arraycopy(inputArray, 0, array, 0, inputArray.length);

		//Bubble Sort Logic
		while (flag)
		{
			flag = false;

			for(int i=0; i<array.length-1; i++)
			{
				if (array[i] > array[i + 1])
				{
					//Swap
					array = swap(i, i + 1, array);

					//Continues until no further swaps occur
					flag = true;
				}
			}
		}

		return array;
	}

	public static void main(String[] args){

		int[] unsortedArray = CommonUtility.randomArrayGenerator();
		long startTime = System.nanoTime();
		int[] sortedArray = doBubbleSort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime - startTime;

		CommandLineOutput.sortingOutput("Bubble Sort", unsortedArray, sortedArray, sortingTime);
	}


}
