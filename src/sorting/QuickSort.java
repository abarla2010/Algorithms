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

		return inputArray;
	}

	/**
	 * Method that partitions the subarray a[low....high] such that
	 * a[low...j-1] <= a[j] <= a[j+1....high] and then return's the j index.
	 * @param low
	 * @param high
	 * @return index of the pivot point
	 */
	public static int partition(int low, int high) {

		int pivot=0;

		return pivot;
	}

	/**
	 * Method to swap two elements in the array
	 * @param a
	 * @param b
	 */
	public static void swap(int a, int b){

	}

	/**
	 * Main method for the Quick Sort Class.
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
