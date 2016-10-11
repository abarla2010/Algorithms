package common;

/**
 * Created by abhishekbarla on 10/10/14.
 */
public class CommandLineOutput {

	public static void sortingOutput(String sortingType, int[] unsortedArray, int[] sortedArray, long sortingTime)
	{
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
}
