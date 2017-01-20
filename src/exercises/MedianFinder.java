package exercises;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/**
 * Created by abhishekbarla on 12/4/16.
 * Find the median of a stream of numbers
 */
public class MedianFinder {
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;

	/**
	 * Constructor
	 */
	public MedianFinder(){
		minHeap = new PriorityQueue<Integer>();
		maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	}

	/**
	 * Method to add a number
	 * @param number
	 */
	public void add(int number){

		//Adding the number to the appropriate heap
		if(maxHeap.size()==0 || number < maxHeap.peek()){
			maxHeap.add(number);
		}
		else{
			minHeap.add(number);
		}

		//Rebalancing the heaps to easily find median
		if(maxHeap.size() - minHeap.size() > 1){
			minHeap.offer(maxHeap.poll());
		}
		else if(minHeap.size() - maxHeap.size() > 1){
			maxHeap.offer(minHeap.poll());
		}
	}

	/**
	 * Method to find the median
	 * @return
	 */
	public double findMedian() {
		if (minHeap.size() == 0 && maxHeap.size() == 0) {
			throw new NoSuchElementException();
		}

		if (maxHeap.size() == 0) {
			return minHeap.peek();
		} else if (maxHeap.size() > minHeap.size()) {
			return maxHeap.peek();
		} else if (minHeap.size() > maxHeap.size()) {
			return minHeap.peek();
		} else {
			return (double) (maxHeap.peek() + minHeap.peek()) / 2;
		}
	}
}
