package util;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abhishekbarla on 10/10/16.
 * The command line output class
 */
public class CommandLineOutput {

	/**
	 * Generic output for all classes
	 * @param problemType : The type of problem
	 * @param input : The input object
	 * @param output : The output object
	 */
	public static void generalOutput(String problemType, Object input, Object output){

		System.out.println("*************************************");
		System.out.println("Results of \'" + problemType + "\'");
		System.out.println("*************************************");

		//Printing the input
		System.out.println("The input is:");
		System.out.println(input.toString());
		System.out.println("*************************************");

		//Printing the output
		System.out.println("The output is:");
		System.out.println(output.toString());
		System.out.println("*************************************");

	}

	/**
	 * Generic output for sorting classes
	 * @param sortingType : Type of sorting to be done
	 * @param unsortedArray : The unsorted array
	 * @param sortedArray : The sorted array
	 * @param sortingTime : The time taken for sorting
	 */
	public static void sortingOutput(String sortingType, int[] unsortedArray, int[] sortedArray, long sortingTime) {
		System.out.println("*************************************");
		System.out.println(sortingType + " Results");
		System.out.println("*************************************");

		//Printing the unsorted array
		System.out.println("Unsorted Array is:");
		for(int i=0; i<unsortedArray.length; i++)
		{
			System.out.print(unsortedArray[i] + " ");
		}
		System.out.println();
		System.out.println("*************************************");

		//Printing the sorted array
		System.out.println("Sorted Array is:");
		for(int i=0; i<sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		System.out.println();
		System.out.println("*************************************");
		System.out.println("Sorting Time: " +(sortingTime)+" nano seconds");
		System.out.println("*************************************");
	}

	/**
	 * Generic output for searching classes
	 * @param searchingType : Type of search
	 * @param index : Index at which the element was found in the array
	 * @param key : Element which is being searched for in the array
	 * @param searchArray : The array to be searched
	 * @param searchingTime : Time taken to search
	 */
	public static void searchingOutput(String searchingType, ArrayList index, int key, int[] searchArray, long searchingTime){

		//Sorting the Result Arraylist
		Collections.sort(index);


		//Failed Search Output
		if(index.contains(-1)) {
			System.out.println("*************************************");
			System.out.println(searchingType + " Results");
			System.out.println("*************************************");

			System.out.println(key+" doesn't exist in:");

			//Printing out the searchArray
			for(int i=0; i<searchArray.length; i++)
			{
				System.out.print(searchArray[i] + " ");
			}
			System.out.println();
			System.out.println("*************************************");
			System.out.println("Searching Time: " +(searchingTime)+" nano seconds");
			System.out.println("*************************************");
		}
		else {
			System.out.println("*************************************");
			System.out.println(searchingType + " Results");
			System.out.println("*************************************");

			if (index.size()==1){
				System.out.println("Found the key \""+key+"\" at index "+index+" in:");
			}
			else {
				System.out.println("Found the key \""+key+"\" at indices "+index+" in:");
			}

			//Printing out the searchArray
			for(int i=0; i<searchArray.length; i++)
			{
				System.out.print(searchArray[i] + " ");
			}
			System.out.println();
			System.out.println("*************************************");
			System.out.println("Searching Time: " +(searchingTime)+" nano seconds");
			System.out.println("*************************************");
		}

	};

}
