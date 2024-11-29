//2.Write a program to declare stack.Store 10 elements into it.Remove 4 elements from stack and display it.

import java.util.Stack;
public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		System.out.println("Stack after adding 10 elements: " + stack);
		for (int i = 0; i < 4; i++) {
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		System.out.println("Stack after removing 4 elements: " + stack);
	}
}
		