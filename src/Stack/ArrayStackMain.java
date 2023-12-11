package Stack;

public class ArrayStackMain {

	public static void main(String[] args) {
		
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		
		stack.push(3);
		stack.push(4);
		stack.push(6);
		
		System.out.println("popped " + stack.pop());


	}

}
