package Stack;

public class ArrayStack<T> {
	static final int MAX_SIZE = 30;
	T arr[] = (T[])new Object[MAX_SIZE];
	int top;
	
	
	ArrayStack() {
		top = -1;
	}
	
	public void push(T val) {
		if(top == MAX_SIZE-1) {
			throw new IndexOutOfBoundsException("Stack overflow");
		}
		arr[++top] = val;
	}
	
	public T pop() {
		if(top == -1) {
			throw new IndexOutOfBoundsException("Stack underflow");
		}
		return arr[top--];
	}
	
	public T peek() {
		return arr[top];
		
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
}
