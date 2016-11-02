package recursion;

import util.CommandLineOutput;

/**
 * Created by abhishekbarla on 10/28/16.
 * Triangle Number using recursion
 * Example: input = 4, output = 10 (i.e 4+3+2+1)
 */
public class TriangularNumbers {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args){

		int input = 4;

		CommandLineOutput.generalOutput("Triangle Number Addition Using Recursion", input, sumTriangle(input));
	}

	/**
	 * Method to find sum of numbers in a triangle using recursion
	 * @param n
	 * @return
	 */
	public static int sumTriangle(int n){
		if(n==0 || n==1){
			return n;
		}

		return (n + sumTriangle(n-1));
	}
}
