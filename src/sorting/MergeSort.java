package sorting;

import util.CommonUtility;

/**
 * Created by abhishekbarla on 10/10/16.
 * TODO
 */
public class MergeSort {

	public static void doMergeSort(int[] inputArray){

		//Base case


	}
	public static void main(String[] args){

		int[] unsortedArray = CommonUtility.randomArrayGenerator();
		long startTime = System.nanoTime();
		//int[] sortedArray = doMergeSort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime - startTime;
		doMergeSort(unsortedArray);
	}
}
