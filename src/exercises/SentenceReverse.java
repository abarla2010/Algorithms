package exercises;

/**
 * Created by abhishekbarla on 12/10/16.
 * You are given an array of characters arr, which consists of sequences of characters separated
 * by space characters. Each space-delimited sequence of characters defines a word. How can you
 * most efficiently reverse the order of the words in the array? Explain and implement your solution.
 * Lastly, analyze its time and space complexities.
 */
public class SentenceReverse {

	public static void main(String[] args){
		char[] input = {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};
		char[] output = sentenceReverse(input);
		for(int i=0; i<output.length; i++){
			if(i==0){
				System.out.print("[ " + "\'" + output[i] + "\'" + ", ");
			}
			else if(i==output.length-1){
				System.out.print("\'" + output[i] + "\'" + " ]");
			}
			else{
				System.out.print("\'" + output[i] + "\'" + ", ");
			}
		}
	}

	public static char[] sentenceReverse(char[] input) {
		char[] temp = new char[input.length];
		if(input.length == 0 || input.length == 1){
			return input;
		}

		//Reverse all chars in the input array
		temp = reverseCharacters(input, 0, input.length-1);

		//Reverse words
		input = reverseWords(input);

		return input;
	}

	public static char[] reverseWords(char[] input){
		int start = 0;
		int end = 0;
		for(int i=0; i<input.length; i++){
			if(input[i] == ' '){
				input = reverseCharacters(input, start, end);
				start = i+1;
				end = start;
			}
			else if(i==input.length-1){
				input = reverseCharacters(input, start, end);

				//TODO
			}
			else{
				end++;
			}
		}

		return input;
	}


	public static char[] reverseCharacters(char[] input, int start, int end){
		char temp = ' ';
		for(int i=start; i<end/2; i++){
			temp = input[i];
			input[i] = input[end-i-1];
			input[end-i-1] = temp;
		}
		return input;
	}
}

