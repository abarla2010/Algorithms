package exercises;

import java.util.HashMap;

/**
 * Created by abhishekbarla on 11/23/16.
 */
public class HighestOccurencingNumber {
		public static int getHighestNumber(int[]  inputArray){

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int highestNumber = 0;
			int highestCount = 0;
			int occurenceCount = 0;


			for(int i=0; i<inputArray.length; i++){
				if(map.containsKey(inputArray[i])){
					occurenceCount = map.get(inputArray[i]);
					occurenceCount++;
					map.put(inputArray[i], occurenceCount);
				}
				else{
					map.put(inputArray[i], 1);
				}

				if(map.get(inputArray[i]) > highestCount){
					highestCount = inputArray[i];
					highestNumber = inputArray[i];
				}
			}
			return highestNumber;
		}

		public static void main(String[] args){
			int[] input = {1,2,3,4,5,6,7,8,9,10};

			System.out.println(getHighestNumber(input));
		}
	}
