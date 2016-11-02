package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by abhishekbarla on 11/2/16.
 */
public class BlockingQueueExample {

	public static void main(String[] args){

		BlockingQueue blockingQueue = new ArrayBlockingQueue(2);

		//Creating producer and consumer objects
		MultiThreadingProducer producer = new MultiThreadingProducer(blockingQueue);
		MultiThreadingConsumer consumer = new MultiThreadingConsumer(blockingQueue);

		//Creating threads for producer and consumer
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		//Activating the threads
		producerThread.start();
		consumerThread.start();
	}

}
