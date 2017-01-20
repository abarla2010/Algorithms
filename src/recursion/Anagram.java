package recursion;

import util.CommandLineOutput;

import java.util.ArrayList;

/**
 * Created by abhishekbarla on 10/28/16.
 * Anagram Class
 */
public class Anagram {

	public static ArrayList<String> arrayList = new ArrayList<>();

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args){

		String input = "cat";
		ArrayList<String> output = permutation(input);

		CommandLineOutput.generalOutput("Anagrams Using Recursion", input, output);
	}

	public static ArrayList<String> doAnagram(String inputString){

		String prefix = "";
		return doAnagram(prefix, inputString);
	}

	public static ArrayList<String> doAnagram(String prefix, String inputString){

		int stringLength = inputString.length();

		//Base case
		if(stringLength == 0){
			arrayList.add(prefix);
		}
		else{
			//TODO
			for(int i=0; i<stringLength; i++){
				doAnagram(prefix + inputString.substring(0,i), inputString.substring(i+1,stringLength));
			}
		}

		return arrayList;
	}


	public static ArrayList permutation(String str) {
		return permutation("", str);
	}

	private static ArrayList permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) arrayList.add(prefix);
		else {
			for (int i = 0; i < n; i++){
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
			}
		}
		return  arrayList;
	}

	public static ArrayList findAnagram(String inputString){
		ArrayList output = anagram("",inputString);
		return output;
	}

	private static ArrayList anagram(String prefix, String inputString){
		int stringLength = inputString.length();
		if(stringLength==0){
			arrayList.add(prefix);
		}
		else{
			for(int i=0; i < stringLength; i++){
				anagram(prefix + inputString.charAt(i), inputString.substring(0,i) + inputString.substring(i+1, stringLength));
			}
		}
		return arrayList;
	}
}
