package sorting;

import util.CommandLineOutput;
import util.CommonUtility;

/**
 * Created by abhishekbarla on 10/10/16.
 * Merge Sort implementation class
 *
 */
public class MergeSort {

	/**
	 * Method to break the array down into smaller pieces using recursion
	 * @param inputArray
	 * @return
	 */
	public static int[] doMergeSort(int[] inputArray){

		int arrayLength = inputArray.length;
		int[] left = new int[arrayLength/2];
		int[] right = new int[arrayLength - arrayLength/2];
		for(int i=0; i<left.length; i++){
			left[i] = inputArray[i];
		}
		for(int j=0; j<right.length; j++){
			right[j] = inputArray[j+arrayLength/2];
		}

		//Base Case
		if(arrayLength<=1){
			return inputArray;
		}

		int[] leftOutput = doMergeSort(left);
		int[] rightOutput = doMergeSort(right);

		return MergeParts(leftOutput, rightOutput);
	}

	/**
	 * Method to merge the two parts of the array
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] MergeParts(int[] left, int[] right){
		int[] tempArray = new int[left.length + right.length];
		int i = 0;
		int j = 0;

		for(int k=0; k<tempArray.length; k++){

			//If left array has reached its end, simply add all remaining elements of the right array
			if(i>=left.length){
				tempArray[k] = right[j++];
			}
			//If right array has reached its end, simply add all remaining elements of the left array
			else if(j>=right.length){
				tempArray[k] = left[i++];
			}
			//If left array element is smaller, then add it to the final array
			else if(left[i] <= right[j]){
				tempArray[k] = left[i++];
			}
			//If the right array element is smaller, then add it to the final array
			else {
				tempArray[k] = right[j++];
			}
		}

		return tempArray;
	}

	/**
	 * Method to check if an array is sorted
	 * @param inputArray
	 * @return
	 */
	public static boolean isSorted(int[] inputArray){
		for(int i=0; i<inputArray.length-1; i++){
			if(inputArray[i] > inputArray[i+1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Main method of the class
	 * @param args
	 */
	public static void main(String[] args){

		int[] unsortedArray = CommonUtility.randomArrayGenerator();
		long startTime = System.nanoTime();
		int[] sortedArray = doMergeSort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime - startTime;
		//System.out.println(isSorted(sortedArray));

		CommandLineOutput.sortingOutput("Merge Sort", unsortedArray, sortedArray, sortingTime);
	}
}
