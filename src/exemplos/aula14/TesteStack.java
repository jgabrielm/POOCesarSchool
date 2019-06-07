package exemplos.aula14;

import java.util.Stack;

public class TesteStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		stack.pop();
		stack.pop();
		System.out.println(stack);
		
		stack.push(11);
		System.out.println(stack);
	}
}
