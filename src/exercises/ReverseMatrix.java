package exercises;

import util.CommandLineOutput;

/**
 * Created by abhishekbarla on 10/29/16.
 */
public class ReverseMatrix {

	public static void main(String[] args){

		String inputString = "";
		String outputString = "";
		String methodName = "";
		int[] input1DMatrix = {1,2,3,4,5,6,7,8,9,10};
		int[][] input2DMatrix = {{1,2,3},{4,5,6},{7,8,9}};

		String method = "2D Column Reverse";

		switch (method){
			case "1D": {
				methodName = "Reversing a 1D Matrix";
				inputString = convertToString(input1DMatrix);
				int[] output1DMatrix = reverseMatrix(input1DMatrix);
				outputString = convertToString(output1DMatrix);
				break;
			}
			case "2D Column Reverse":{
				methodName = "Reversing the Columns in a 2D Matrix";
				inputString = convertToString(input2DMatrix);
				int[][] output2DMatrix = reverseColumns(input2DMatrix);
				outputString = convertToString(output2DMatrix);
				break;
			}
			case "2D Row Reverse":{
				methodName = "Reversing the Rows in a 2D Matrix";
				inputString = convertToString(input2DMatrix);
				int[][] output2DMatrix = reverseRows(input2DMatrix);
				outputString = convertToString(output2DMatrix);
				break;
			}
		}
		CommandLineOutput.generalOutput(methodName, inputString, outputString);
	}

	/**
	 * Method that reverses a 1D array
	 * @param inputMatrix
	 * @return
	 */
	public static int[] reverseMatrix(int[] inputMatrix){
		int temp = 0;

		for(int i=0; i<inputMatrix.length/2; i++){
			temp = inputMatrix[i];
			inputMatrix[i] = inputMatrix[inputMatrix.length-1-i];
			inputMatrix[inputMatrix.length-1-i] = temp;
		}

		return inputMatrix;
	}

	/**
	 * Reverse rows in a 2D matrix
	 * @param inputMatrix
	 * @return
	 */
	public static int[][] reverseColumns(int[][] inputMatrix){

		int temp = 0;

		for(int i=0; i<inputMatrix.length; i++){
			inputMatrix[i] = reverseMatrix(inputMatrix[i]);
		}

		return inputMatrix;
	}

	/**
	 * Reverse columns in a 2D matrix
	 * @param inputMatrix
	 * @return
	 */
	public static int[][] reverseRows(int[][] inputMatrix){
		int[] temp1DMatrix;

		for(int i=0; i<inputMatrix.length/2; i++){
			temp1DMatrix = inputMatrix[i];
			inputMatrix[i] = inputMatrix[inputMatrix.length-1-i];
			inputMatrix[inputMatrix.length-i-1] = temp1DMatrix;
		}

		return inputMatrix;
	}

	/**
	 * Converts 1D matrix to string
	 * @param inputMatrix
	 */
	public static String convertToString(int[] inputMatrix){

		String output = "";

		for(int i=0; i<inputMatrix.length; i++){

			if(i==0){
				output = "[" + inputMatrix[i] + ", ";
			}
			else if(i==inputMatrix.length-1){
				output = output + inputMatrix[i] + "]";
			}
			else{
				output += inputMatrix[i] + ", ";
			}
		}
		return output;
	}

	/**
	 * Converts a 2D Matrix into a String
	 * @param inputMatrix
	 * @return
	 */
	public static String convertToString(int[][] inputMatrix){
		String output = "";

		for(int i=0; i<inputMatrix.length; i++){

			if(i==0){
				output = "[ " + convertToString(inputMatrix[i]) + ", ";
			}
			else if(i==inputMatrix.length-1){
				output = output + convertToString(inputMatrix[i]) + " ]";
			}
			else{
				output = output + convertToString(inputMatrix[i]) + ", ";
			}
		}
		return output;
	}
}

