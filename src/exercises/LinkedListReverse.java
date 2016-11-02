package exercises;

/**
 * Created by abhishekbarla on 10/31/16.
 * Class of Singly linked List with reverse method
 */
public class LinkedListReverse {

	public int count;
	public LinkedListNode next;
	public LinkedListNode head;


	/**
	 * Constructor
	 */
	public LinkedListReverse(){
	}

	/**
	 * Method to add an object to the end of the Linked List
	 * @param inputData
	 */
	public void add(Object inputData){

		LinkedListNode inputNode = new LinkedListNode(inputData);
		LinkedListNode tempNode = null;

		if(count==0){
			head = inputNode;
		}
		else{
			tempNode = head;

			while(tempNode.next!=null){
				tempNode = tempNode.next;
			}

			tempNode.next = inputNode;
		}

		count++;
	}

	/**
	 * Method to reverse a LinkedList
	 * @param inputHead
	 * @return
	 */
	public LinkedListNode reverse(LinkedListNode inputHead){

		if(inputHead == null || inputHead.next == null){
			return inputHead;
		}

		LinkedListNode p1 = inputHead;
		LinkedListNode p2 = p1.next;

		inputHead.next = null;
		while(p1!=null && p2!=null){
			LinkedListNode temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}

		return p1;
	}

	/**
	 * Method to find out the size of the Linked List
	 * @return
	 */
	public int size(){
		return count;
	}

	/**
	 * Method to get the object of a node at a particular index
	 * @return
	 */
	public Object get(int index){

		LinkedListNode tempNode = null;
		if(index <0) return null;

		if(head!=null){

			tempNode = head;

			//Find the index node
			for(int i=0; i<index; i++){
				tempNode = tempNode.next;
			}
		}

		return tempNode.data;
	}

	/**
	 * Method to print the Linked List to a String
	 * @return
	 */
	public String toString(){

		String finalString = "";

		for(int i =0; i<count; i++){
			finalString = finalString + get(i) + " ";
		}

		return finalString;
	}

	/**
	 * Method to print a linked list from head
	 * @param head
	 */
	public void printList(LinkedListNode head){

		LinkedListNode tempNode = head;

		while(tempNode!=null){
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args){
		LinkedListReverse linkedList = new LinkedListReverse();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.add(9);
		linkedList.add(10);

		System.out.println("Printing forward");
		System.out.println(linkedList.toString());
		linkedList.printList(linkedList.head);
		System.out.println("Reversing the Singly Linked List");
		LinkedListNode reversedHead = linkedList.reverse(linkedList.head);
		System.out.println("Printing backwards");
		linkedList.printList(reversedHead);
	}
}
