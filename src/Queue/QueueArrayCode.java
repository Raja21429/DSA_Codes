package Queue;

public class QueueArrayCode {
	static final int MAX_SIZE = 30;
	int arr[] = new int [MAX_SIZE];;
	int front,rear;
	
	public QueueArrayCode() {
		front = -1;
		rear = -1;
	}
	
	public void enqueue(int val) {
		if(rear == MAX_SIZE-1)
			throw new IndexOutOfBoundsException("Queue is Full");
		if(front == -1)
			front++;
		arr[++rear] = val;
		
	}
	public int dequeue() {
		if(front == -1 || front>rear)
			throw new IndexOutOfBoundsException("Queue is Empty");
		return arr[front++];
	}
	
	

}
