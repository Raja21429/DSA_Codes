package Queue;

public class QueueArrayMain {

	public static void main(String[] args) {
		QueueArrayCode b = new QueueArrayCode();
		b.enqueue(1);
		b.enqueue(2);
		b.enqueue(3);
		b.enqueue(4);
		
		System.out.println("dequeue " + b.dequeue());
		System.out.println("dequeue " + b.dequeue());
		System.out.println("dequeue " + b.dequeue());
		System.out.println("dequeue " + b.dequeue());
		
		b.enqueue(5);
		b.enqueue(6);
		
		System.out.println("dequeue " + b.dequeue());
		System.out.println("dequeue " + b.dequeue());
	}

}
