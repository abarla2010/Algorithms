package multithreading;

import java.util.concurrent.BlockingQueue;

/**
 * Created by abhishekbarla on 11/2/16.
 * Simple producer class to be used in the blocking queue example class
 */
public class MultiThreadingProducer implements Runnable {

	private BlockingQueue blockingQueue = null;

	/**
	 * Constructor
	 * @param queue
	 */
	public MultiThreadingProducer(BlockingQueue queue){
		this.blockingQueue = queue;
	}

	/**
	 * Method to put the thread into run mode
	 */
	public void run() {

		try{
			blockingQueue.put(1);
			Thread.sleep(1000l);
			blockingQueue.put(2);
			Thread.sleep(1000l);
			blockingQueue.put(3);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
