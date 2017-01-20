package exercises;

/**
 * Created by abhishekbarla on 12/12/16.
 */
public class Solution {
	private static int IDTracker = 0;
	private int ID = 0;

	public Solution(){
		ID = ++IDTracker;
	}

	public int getID(){
		return ID;
	}

}
