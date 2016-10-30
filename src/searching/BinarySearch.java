package searching;

import util.CommandLineOutput;
import util.CommonUtility;

import java.util.ArrayList;

/**
 * Binary Search Algorithm wiht log(n) time complexity
 * Created by abhishekbarla on 10/11/16.
 * TODO: This doesn't work with duplicate keys in the sorted array
 */
public class BinarySearch {

	public static ArrayList index = new ArrayList();

	/**
	 * Binary Search Logic
	 * @param inputArray
	 * @param key
	 * @return
	 */
	public static ArrayList doBinarySearch(int[] inputArray, int key){

		int startIndex = 0;
		int endIndex = inputArray.length-1;
		int middleIndex = 0;
		int temp = 0;

		while(endIndex >= startIndex)
		{
			middleIndex = (endIndex + startIndex)/2;

			if (key == inputArray[middleIndex])
			{
				index.add(middleIndex);

				//Going front to search for all indices where the key is present
				temp = middleIndex+1;
				while(temp <= inputArray.length-1 && inputArray[temp] == key){

					index.add(temp);
					temp++;

					/*if(firstFoundIndex == middleIndex){
						firstFoundIndex++;
					}
					else{
						index.add(firstFoundIndex);
						firstFoundIndex++;
					}*/
				}


				//Going back to search for all indices where the key is present
				temp = middleIndex-1;
				while (temp >=0 && inputArray[temp] == key){

					index.add(temp);
					temp--;

					/*if(firstFoundIndex == middleIndex){
						firstFoundIndex--;
					}
					else{
						index.add(firstFoundIndex);
						firstFoundIndex--;
					}*/
				}

				break;
			}
			if(key < inputArray[middleIndex])
			{
				endIndex = middleIndex-1;
			}
			if(key > inputArray[middleIndex])
			{
				startIndex = middleIndex+1;
			}
		}

		if(startIndex>endIndex)
		{
			index.add(-1);
		}

		return index;
	}

	public static void main(String[] args){

		int[] sortedArray = CommonUtility.randomSortedArrayGenerator();
		int randomElement = CommonUtility.generateRandomNumber();
		long startTime = System.nanoTime();
		ArrayList index = doBinarySearch(sortedArray, randomElement);
		long endTime = System.nanoTime();
		long searchingTime = (endTime - startTime);

		CommandLineOutput.searchingOutput("Binary Search", index, randomElement, sortedArray, searchingTime );

	}
}
