package exercises;

import java.util.HashMap;

/**
 * Created by abhishekbarla on 12/11/16.
 * LRU Cache Implementation using HashMap and Doubly Linked List
 */
public class LRUCache {
	public HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	int capacity = 0;
	Node head = null;
	Node tail = null;

	public LRUCache(int capacity){
		this.capacity = capacity;
	}

	/**
	 * Method to Get the value associate with the key
	 * @param key
	 * @return
	 */
	public int get(int key){
		if(map.containsKey(key)){
			Node temp = map.get(key);
			remove(temp);
			setHead(temp);
			return temp.value;
		}

		return -1;
	}

	public void setHead(Node temp){
		if(head == null){
			head = temp;
			tail = head;
		}
		else{
			head.prev = temp;
			temp.next = head;
			head = temp;
		}
	}

	/**
	 * Helper function to remove a Node from the Doubly Linked List
	 * @param temp
	 */
	public void remove(Node temp){

		if(temp.prev != null){
			temp.prev.next = temp.next;
		}
		else{
			head = temp.next;
		}

		if(temp.next != null){
			temp.next.prev = temp.prev;
		}
		else{
			tail = temp.prev;
		}
	}

	/**
	 * Method to set a particular value to a key.
	 * If the key doesn't exist in the LRUCache, it creates the key and adds it
	 * @param key
	 * @param value
	 */
	public void set(int key, int value){
		if(map.containsKey(key)){
			Node old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		}
		else{
			Node newNode = new Node(key, value);
			if(map.size()>=capacity){
				map.remove(tail.key);
				remove(tail);
				setHead(newNode);
			}
			else{
				setHead(newNode);
			}
			map.put(key, newNode);
		}
	}


}

/**
 * Helper Node class
 */
class Node{
	int key;
	int value;
	Node next;
	Node prev;

	Node(int key, int value){
		this.key = key;
		this.value = value;
	}
}
