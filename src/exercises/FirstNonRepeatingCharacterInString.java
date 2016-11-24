package exercises;

import util.CommandLineOutput;

import java.util.HashMap;

/**
 * Created by abhishekbarla on 11/02/16.
 * Find first non repeating character in a string. For example: 'i' in "GoodisGood"
 */
public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args){

		String inputString = "-a-";

		char output = getFirstNonRepeatingCharacter(inputString);

		CommandLineOutput.generalOutput("First non repeating character in a String", inputString, output);
	}

	public static char getFirstNonRepeatingCharacter(String inputString){

		char output = ' ';
		int tempCount = 0;
		HashMap<Character, Integer> map = new HashMap<>();

		//Go through the string and store the count of each character in a hashmap
		for(int i=0; i<inputString.length(); i++){

			//Check if the map already contains that character and add one to the value
			if(map.containsKey(inputString.charAt(i))){
				tempCount = map.get(inputString.charAt(i));
				tempCount++;
				map.put(inputString.charAt(i), tempCount);
			}
			else{
				map.put(inputString.charAt(i), 1);
			}
		}

		//Go through the string again and check for the first non-repeating character
		for(int i=0; i<inputString.length(); i++){
			if (map.get(inputString.charAt(i)) == 1){
				return inputString.charAt(i);
			}
		}

		return output;
	}
}
