package exercises;

import util.CommandLineOutput;
import util.CommonUtility;

import java.util.Stack;

/**
 * Created by abhishekbarla on 10/20/16.
 * This class checks if the delimiters in a string match,
 * i.e., for every opening bracket '[' there should be a closing bracket ']'
 * and for every opening parenthesis '(' there should be a closing parenthesis ')'
 * and for every opening braces '{' there should be a closing braces '}'
 * This is implemented using a Stack
 */
public class DelimiterMatching {

	public static boolean checkDelimiterMatching(String inputString){

		boolean perfectMatch = true;
		char openingDelimiter;
		char closingDelimiter;


		Stack stack = new Stack();

		for(int i=0; i<inputString.length(); i++){
			if(inputString.charAt(i)== '{' || inputString.charAt(i)=='[' || inputString.charAt(i) == '('){
				stack.push(inputString.charAt(i));
			}
			if(inputString.charAt(i)== '}' || inputString.charAt(i)==']' || inputString.charAt(i) == ')'){
				 closingDelimiter = inputString.charAt(i);
				 openingDelimiter = (char)stack.pop();

				if ( (closingDelimiter == '}' && openingDelimiter != '{') ||
						(closingDelimiter == ']' && openingDelimiter != '[')  ||
						(closingDelimiter == ')' && openingDelimiter != '(')){
					perfectMatch = false;
					break;
				}
			}
		}


		return perfectMatch;
	}

	public static void main(String[] args){

		String outputString = "";
		String inputString = CommonUtility.getStringFromCommandLine("Enter a String with delimiters");
		boolean delimiterMatch = checkDelimiterMatching(inputString);

		if(delimiterMatch == true){
			outputString = "Perfect Match!";
		}
		else{
			outputString = "Some of the delimiters are missing";
		}

		CommandLineOutput.generalOutput("Delimiter Matching", inputString, outputString);
	}
}
