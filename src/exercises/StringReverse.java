package exercises;

import util.CommandLineOutput;
import util.CommonUtility;

import java.util.Stack;

/**
 * Created by abhishekbarla on 10/20/16.
 * This class reverses a string using a Stack
 */
public class StringReverse {

	public static String reverseString (String inputString){
		String reversedString = "";

		Stack stack = new Stack();

		//Pushing each character of the string into the Stack
		for(int i=0; i<inputString.length(); i++)
		{
			stack.push(inputString.charAt(i));
		}

		//Popping characters out of the stack and building a new String
		for (int i=0; i<inputString.length(); i++)
		{
			reversedString += stack.pop();
		}

		return reversedString;
	}

	public static void main(String[] args){

		String inputString = CommonUtility.getStringFromCommandLine("Enter the String to be Reversed: ");
		String reversedString = reverseString(inputString);

		CommandLineOutput.generalOutput("String Reverse Using a Stack", inputString, reversedString);
	}
}
