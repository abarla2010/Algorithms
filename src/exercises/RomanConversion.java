package exercises;

import java.util.HashMap;

/**
 * Created by abhishekbarla on 11/29/16.
 */
public class RomanConversion {
	public static void main(String[] args){

		String romanString = "CXXXVI";
		int outputInteger = convertToInteger(romanString);
		System.out.println(outputInteger);

		int number = 999;
		String outputRomanString = "";
		outputRomanString = convertToRoman(number);
		System.out.println(outputRomanString);

	}

	/**
	 * Method to convert Integer to Roman
	 * @param number
	 * @return
	 */
	public static String convertToRoman(int number){

		String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

		return C[(number%1000)/100] + X[(number%100)/10] + I[number%10];
	}

	/**
	 * Method to convert a Roman number into an Integer
	 * @param input
	 * @return
	 */
	public static int convertToInteger(String input){
		int sum = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);

		for(int i=input.length()-2; i>=0; i--){
			if(map.get(input.charAt(i)) >= map.get(input.charAt(i+1))) {
				sum = sum + map.get(input.charAt(i));
			}
			else{
				sum = sum - map.get(input.charAt(i));
			}
		}

		sum = sum + map.get(input.charAt(input.length()-1));

		return sum;
	}


}
