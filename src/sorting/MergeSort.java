package sorting;

import util.CommandLineOutput;
import util.CommonUtility;

/**
 * Created by abhishekbarla on 10/10/16.
 *
 */
public class MergeSort {

	private static int[] unsortedArray;
	private static int[] tempArray;

	/**
	 * Method to do MergeSort
	 * @param lowerIndex
	 * @param higherIndex
	 */
	public static void doMergeSort(int lowerIndex, int higherIndex){

		int middleIndex;

		//Ignoring when low>high as they are invalid indices
		if(lowerIndex < higherIndex){

			middleIndex = lowerIndex + (higherIndex-lowerIndex)/2;

			//MergeSort on left half
			doMergeSort(lowerIndex, middleIndex);
			//MergeSort on right half
			doMergeSort(middleIndex+1, higherIndex);

			//Combine the two halves
			mergeHalves(lowerIndex, middleIndex, higherIndex);
		}
	}

	/**
	 * Method to merge the halves
	 * @param lowerIndex
	 * @param middleIndex
	 * @param higherIndex
	 */
	public static void mergeHalves(int lowerIndex, int middleIndex, int higherIndex){
		//TODO

		//Copy the original array into a temp array
		for(int i=lowerIndex; i<middleIndex; i++){
			tempArray[i] = unsortedArray[i];
		}

		int i = lowerIndex;
		int j = middleIndex + 1;
		int k = lowerIndex;

		//Merge the array elements in increasing order
		while(i<=middleIndex && j<=higherIndex){

			if(tempArray[i] <= tempArray[j]){
				unsortedArray[k] = tempArray[i];
				i++;
			}
			else{
				unsortedArray[k] = tempArray[j];
				j++;
			}
			k++;
		}

		//If either of the two sub parts are empty
		while(i<=middleIndex){
			unsortedArray[k] = tempArray[i];
			k++;
			i++;
		}
	}


	/**
	 * Method to sort
	 * @param inputArray
	 * @return
	 */
	public static int[] sort(int[] inputArray){
		tempArray = new int[inputArray.length];
		doMergeSort(0, inputArray.length-1);
		return inputArray;
	}

	/**
	 * Main method of the class
	 * @param args
	 */
	public static void main(String[] args){

		unsortedArray = CommonUtility.randomArrayGenerator();
		long startTime = System.nanoTime();
		int[] sortedArray = sort(unsortedArray);
		long endTime = System.nanoTime();
		long sortingTime = endTime - startTime;

		CommandLineOutput.sortingOutput("Merge Sort", unsortedArray, sortedArray, sortingTime);
	}
}
