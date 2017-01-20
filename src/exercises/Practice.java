package exercises;
/**
 * Created by abhishekbarla on 12/4/16.
 */
public class Practice {
	public static void main(String[] args){
		MedianFinder medianFinder = new MedianFinder();
		medianFinder.add(1);
		medianFinder.add(2);
		medianFinder.add(3);
		medianFinder.add(4);
		//medianFinder.add(5);
		System.out.println(medianFinder.findMedian());
	}
}
