package util;

import java.util.ArrayList;

/**
 * Created by abhishekbarla on 10/10/16.
 */
public class CommandLineOutput {

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

	public static void searchingOutput(String searchingType, ArrayList index, int key, int[] searchArray, long searchingTime){

		//Failed Search Output
		if(index.contains(-1)) {
			System.out.println("*************************************");
			System.out.println(searchingType + " Results");
			System.out.println("*************************************");

			System.out.println(key+" doesn't exist in:");

			//Printing out the searchArray
			//System.out.println("in:");
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
			//System.out.println("in:");
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
