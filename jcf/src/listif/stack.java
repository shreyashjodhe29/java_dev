package listif;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(10);
		stack.push(89);
		stack.push(56);
		stack.push(78);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(null);
		System.out.println(stack);
		
	    System.out.println(	stack.search(56));
		System.out.println(stack);
		System.out.println(stack.empty());

	}

}
