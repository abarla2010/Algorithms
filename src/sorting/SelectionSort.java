package sorting;

import util.CommandLineOutput;
import util.CommonUtility;

/**
 * Created by abhishekbarla on 10/12/16.
 * Selection Sort Class
 */
public class SelectionSort {


	public static int[] doSelectionSort(int[] inputArray){

		int temp = 0;
		int minIndex = 0;
		int[] array = new int[inputArray.length];

		//Copying the input array to printout both the sorted and the unsorted array in the results
		System.arraycopy(inputArray, 0, array, 0, inputArray.length);

		//Selection Sort Logic
		for(int i=0; i<array.length-1; i++)
		{
			//Set the i element as the min
			minIndex = i;

			//Finding the min value
			for(int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[minIndex])
				{
					minIndex = j;
				}
			}

			//Swap
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;

		}

		return array;
	}

	public static void main(String[] args){

		int[] unsortedArray = CommonUtility.randomArrayGenerator();
		long startTime = System.nanoTime();
		int[] sortedArray = doSelectionSort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime-startTime;

		CommandLineOutput.sortingOutput("Selection Sort", unsortedArray, sortedArray, sortingTime);
	}
}
