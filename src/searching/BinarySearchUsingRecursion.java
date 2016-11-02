package searching;

import util.CommandLineOutput;
import util.CommonUtility;

import java.util.ArrayList;

/**
 * Created by abhishekbarla on 10/29/16.
 * Binary Search Using Recursion Class
 */
public class BinarySearchUsingRecursion {

	private static int[] sortedArray;
	private static ArrayList outputArray = new ArrayList();

	public static void main(String[] args){

		sortedArray = CommonUtility.randomSortedArrayGenerator();
		int randomElement = CommonUtility.generateRandomNumber();
		long startTime = System.nanoTime();
		find(randomElement);
		long endTime = System.nanoTime();
		long searchingTime = (endTime - startTime);

		CommandLineOutput.searchingOutput("Binary Search Using Recursion", outputArray, randomElement, sortedArray, searchingTime);
	}

	/**
	 * @param key :key to find in the array
	 * @return : Returns an arraylist of indices where the key is found
	 */
	public static void find(int key){
		doBinarySearch(0,sortedArray.length-1,key);
	}

	private static void doBinarySearch(int startIndex, int endIndex, int key){

		int mid =  (startIndex + endIndex)/2;
		int temp = 0;

		if(key == sortedArray[mid]) {
			outputArray.add(mid);


			//Going forward to check if any more indices exist with the same key
			temp = mid+1;
			while (temp<sortedArray.length && sortedArray[temp]==key){
				outputArray.add(temp);
				temp++;
			}

			//Going backwards to check if any more indices exist with the same key
			temp = mid-1;
			while(temp>=0 && sortedArray[temp]==key){
				outputArray.add(temp);
				temp--;
			}
		}
		else if (startIndex > endIndex){
			outputArray.add(-1);
		}
		else{
			if(key < sortedArray[mid]){
				//Left Side
				doBinarySearch(startIndex, mid-1, key);
			}
			else {
				//Right Side
				doBinarySearch(mid+1, endIndex, key);
			}
		}
	}
}
