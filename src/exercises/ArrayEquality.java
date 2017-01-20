package exercises;

import java.util.HashMap;

/**
 * Created by abhishekbarla on 11/30/16.
 * Class to check for array equality with O(n) time complexity
 */
public class ArrayEquality {
	public static void main(String[] args){
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(checkIfEqual(arr1,arr2));
	}

	/**
	 * Method to check if two arrays are equal
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static boolean checkIfEqual(int[] arr1, int[] arr2){
		HashMap<Integer, Integer> map = new HashMap<>();

		if(arr1.length != arr2.length){
			return false;
		}

		//Put first array in a map
		for(int i=0; i<arr1.length; i++){
			if(map.containsKey(arr1[i])){
				int tempCount = map.get(arr1[i]);
				map.put(arr1[i], ++tempCount);
			}
			else{
				map.put(arr1[i], 1);
			}
		}

		//Check if second array has all elements
		for(int j=0; j<arr2.length; j++){
			if(map.containsKey(arr2[j])){
				if(map.get(arr2[j]) > 1){
					int tempNumber = map.get(arr2[j]);
					map.put(arr2[j], --tempNumber);
				}
				else{
					map.remove(arr2[j]);
				}
			}
			else{
				return false;
			}
		}
		return true;
	}
}

