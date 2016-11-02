package exercises;

/**
 * Created by abhishekbarla on 10/31/16.
 */
public class LinkedListNode {

	public Object data;
	public LinkedListNode next;
	public LinkedListNode previous;

	/**
	 * Constructor
	 */
	public LinkedListNode(Object input){
		this.data = input;
		this.next = null;
		this.previous = null;
	}
}
