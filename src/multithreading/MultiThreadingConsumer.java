package multithreading;

import java.util.concurrent.BlockingQueue;

/**
 * Created by abhishekbarla on 11/2/16.
 * Simple consumer class to be used in the blocking queue example class
 */
public class MultiThreadingConsumer implements Runnable {

	private BlockingQueue blockingQueue = null;

	/**
	 * Constructor
	 * @param queue
	 */
	public MultiThreadingConsumer(BlockingQueue queue){
		this.blockingQueue = queue;
	}

	/**
	 * Method to put the thread into run mode
	 */
	public void run(){

		try{
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

}
