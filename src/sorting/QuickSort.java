package sorting;

import util.CommandLineOutput;
import util.CommonUtility;

/**
 * Created by abhishekbarla on 10/11/16.
 * Quick Sort Class
 */
public class QuickSort {

	/**
	 * Sort method that calls the quicksort method with low and high parameters
	 * @param inputArray
	 * @return an array sorted in ascending order
	 */
	public static int[] sort(int[] inputArray){
		return doQuickSort(inputArray, 0, inputArray.length-1);
	}

	/**
	 * QuickSort method
	 * @param inputArray
	 * @param low
	 * @param high
	 * @return
	 */
	public static int[] doQuickSort(int[] inputArray, int low, int high){


		int pivotIndex = partition(inputArray,low,high);
		System. out .println("Got PivotIndex as " + pivotIndex);
		if (low < pivotIndex -1)
			doQuickSort(inputArray,low,pivotIndex - 1);
		if (pivotIndex+1 < high)
			doQuickSort(inputArray,pivotIndex+1,high);


		//Do Partition

		//Recursion of left side

		//Recursion on right side

		//TODO

		return inputArray;
	}

	/**
	 * Method that partitions the subarray a[low....high] such that
	 * a[low...j-1] <= a[j] <= a[j+1....high] and then return's the j index.
	 * @param array
	 * @param low
	 * @param high
	 * @return index of the pivot point
	 */
	public static int partition(int[] array, int low, int high) {

		//Setting the lower bound as the pivot
		int pivot = array[low];

		while(low < high){

			//Getting to the index which needs to be placed before/after the pivot
			while(array[low] < pivot){
				low++;
			}
			while(array[high] > pivot){
				high--;
			}

			//Swapping the elements to fall in place
			if(low < high){
				swap(array, low, high);

				//If the elements are equal
				if(array[low] == array[high]){
					low++;
				}
			}

		}
		for(int i=0; i<array.length; i++){

			if(array[i] < pivot){
				swap(array, i, pivot);
			}
		}

		return pivot;
	}

	/**
	 * Method to swap two elements in the array
	 * @param a
	 * @param b
	 */
	public static void swap(int[] array, int a, int b){
		int temp = 0;

		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	/**
	 * Main method for the Quick Sort Class
	 * @param args
	 */
	public static void main(String[] args){

		int[] unsortedArray = CommonUtility.randomArrayGenerator();
		long startTime = System.nanoTime();
		int[] sortedArray = sort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = (endTime - startTime);

		CommandLineOutput.sortingOutput("Quick Sort", unsortedArray, sortedArray, sortingTime);
	}
}
