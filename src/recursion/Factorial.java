package recursion;

import util.CommandLineOutput;

/**
 * Created by abhishekbarla on 10/28/16.
 * Factorial class to find out factorial using recursion
 */
public class Factorial {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args){

		int input = 5;
		CommandLineOutput.generalOutput("Factorial Using Recursion", input, factorial(input));
	}

	/**
	 * Method to find the factorial of n using recursion
	 * @param n
	 * @return
	 */
	public static int factorial(int n){

		if(n==0) return 0;
		if(n==1) return 1;

		return n*factorial(n-1);
	}
}
