package exercises;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by abhishekbarla on 12/3/16.
 * Find the indices of all permutations of a string in another bigger string
 */
public class PermutationalPatternSearch {

	public static void main(String[] args){

		ArrayList list = find("ab", "abacaaba");
		System.out.println(list);
	}

	public static ArrayList find(String target, String input){
		ArrayList<Integer> foundIndices = new ArrayList<Integer>();
		String window = "";
		if(target.length()==0 || input.length()==0 || target.length()>input.length()){
			return null;
		}

		//Searching in a window of the length of the target string in the main string if all characters of target string are present
		for(int i=0; i<=input.length()-target.length(); i++){
			window = input.substring(i, i+target.length());
			if(isPermutation(window, target)){
				foundIndices.add(i);
			}
		}
		return foundIndices;
	}

	/**
	 * Method to check if the given string is a permutation of the target string or not
	 * @param window
	 * @return
	 */
	public static boolean isPermutation(String window, String target){
		//Storing all characters of the target string in a map

		HashMap<Character, Integer> map = new HashMap<>();
		int tempCounter = 0;
		for(int j=0; j<target.length(); j++){
			if(map.containsKey(target.charAt(j))){
				tempCounter = map.get(target.charAt(j));
				map.put(target.charAt(j), ++tempCounter);
			}
			else{
				map.put(target.charAt(j), 1);
			}
		}

		for(int j=0; j<window.length(); j++){
			if(map.containsKey(window.charAt(j)) && map.get(window.charAt(j))!=0){
				tempCounter = map.get(window.charAt(j));
				map.put(window.charAt(j), --tempCounter);
			}
			else{
				return false;
			}
		}
		return true;
	}
}
