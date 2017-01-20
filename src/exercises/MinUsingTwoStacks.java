package exercises;

import java.util.Stack;

/**
 * Class that implements getMin of a stack in O(1) time complexity
 */
public class MinUsingTwoStacks {

	public static Stack<Integer> stack1 = new Stack<Integer>();
	public static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {

		insert(5);
		insert(20);
		insert(15);
		insert(1);
		insert(115);
		insert(3);
		insert(11);
		System.out.println(getMin());
	}

	/**
	 * Method to insert a number
	 * @param number
	 */
	public static void insert(int number) {

		if (stack1.isEmpty()) {
			stack1.push(number);
		}
		else {
			if ((int)stack1.peek() >= number) {
				stack1.push(number);
			}
			else {
				while ((int)stack1.peek() < number) {
					stack2.push(stack1.pop());

					if(stack1.isEmpty()){
						break;
					}
				}
				stack1.push(number);

				while (!stack2.isEmpty()) {
					stack1.push(stack2.pop());
				}
			}
		}
	}

	/**
	 * Method to get the minimum number in the stack
	 * @return
	 */
	public static int getMin() {
		return (int)stack1.peek();
	}

	public static int removeMin() {
		return (int)stack1.pop();
	}
}