package exercises;

/**
 * Created by abhishekbarla on 11/24/16.
 * Find the sum of all even numbers and odd numbers in an array using recursion
 */
//TODO
public class EvenOddSum {
	public static int[] array;

	public static int evenSum(int startIndex) {

		int output = 0;

		if(startIndex >= array.length){
			return 0;
		}

		if (array[startIndex] % 2 == 0){
			output = array[startIndex];
		}
		else{
			output = 0;
		}

		return output + evenSum(startIndex+1);
	}

	public static int oddSum(int startIndex){
		int output = 0;

		if(startIndex >= array.length){
			return 0;
		}
		else if(array[startIndex]%2==0){
			output = 0;
		}
		else{
			output = array[startIndex];
		}

		return output + oddSum(startIndex+1);
	}

	public static void main(String[] args) {
		array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(evenSum(0));
		System.out.println(oddSum(0));
	}
}
