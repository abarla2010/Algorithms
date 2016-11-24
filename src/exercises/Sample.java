package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhishekbarla on 11/12/16.
 */
public class Sample {


	public static void main(String[] args){
		String text = "abdcghbaabcdij";
		String pattern = "bcda";
		List<Integer> outputList = searchSubString(text,pattern);
		System.out.println(outputList);
	}

	private static final int NO_OF_CHARS = 256;
	private static boolean compare(int [] arr1, int arr2[]) {
		for(int i = 0; i < NO_OF_CHARS; ++i) {
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

	private static List<Integer> searchSubString(String text, String pattern) {
		List<Integer> output = new ArrayList<Integer>();

		if(text == null && pattern == null)
			return null;
		if(text.length() < pattern.length())
			return null;
		int text_length = text.length();
		int pattern_length = pattern.length();
		int [] patternCount = new int[NO_OF_CHARS];
		int [] windowCount = new int[NO_OF_CHARS];

		for(int i = 0; i < pattern_length; ++i) {
			++patternCount[pattern.charAt(i)];
			++windowCount[text.charAt(i)];
		}
		int i = 0;
		for(i = pattern_length; i < text_length; ++i) {
			if(compare(patternCount, windowCount)) {
				output.add(i-pattern_length);
			}
			++windowCount[text.charAt(i)];
			--windowCount[text.charAt(i - pattern_length)];
		}
		if(compare(patternCount, windowCount)) {
			output.add(i - pattern_length);
		}

		return output;
	}


}
