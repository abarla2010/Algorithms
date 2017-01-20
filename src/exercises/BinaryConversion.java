package exercises;

import java.util.Stack;

/**
 * Created by abhishekbarla on 11/29/16.
 */
public class BinaryConversion {
	public static void main(String[] args){
		int input = 2;
		convertToDecimal(10);
		convertToBinary(input);
	}

	public static void convertToDecimal(int num){
		int sum = 0;
		int remainder = 0;
		int counter = 0;
		while(num > 0){
			remainder = num%10;
			sum = sum + remainder * (int) Math.pow(2, counter++);
			num = num/10;
		}

		System.out.println(sum);
	}

	public static void convertToBinary(int num){
		Stack<Integer> stack = new Stack<Integer>();
		int remainder = 0;
		while(num > 0) {
			remainder = num % 2;
			stack.push(remainder);
			num = num / 2;
		}

		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
	}
}
