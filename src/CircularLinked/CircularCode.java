package CircularLinked;

public class CircularCode<T> {
	Node last;       //ithula last mattum insert pannikalam
	
	class Node{
		T data;
		Node next;
		
		Node(T val){
			data = val;
			next = null;
		}
	}
	CircularCode(){
		last = null;       //newnode create pannum podhu last null than irukkum..so apo intha construture call akum
	}
	public void insertStarting(T val) {
		 Node newNode = new Node(val);
		 if(last == null) {
			 newNode.next = newNode;  //(irukurathu oru new node mattum than)newnode oda next la athe newnode address kuduthom na athu apdiye circul akidu irukkum..athu than 
			 last = newNode;          //antha new node than lastum
		 }
		 else {                       //list is not empty
			 newNode.next = last.next;//write panni patha puriyum
			 last.next = newNode;     //write "     "
		 }
	}
	
	public void insertLast(T val) {
		Node newNode = new Node(val);
		if(last == null) {
			newNode.next = newNode;
			last = null;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void display() {
		Node temp = last.next;
		do {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}while(temp!=last.next);
		
	}
	
	
	public T deleteStarting() {
		if(last == null)  //last null ah iruntha delete attempted throw pannu
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
			
		T temp = last.next.data; //ithu nan delete panna antha value ve venum na
		if(last.next == last) //ithu oru node mattum than irukku apo athu than last.so last.next la antha lastoda address iruntha,
			last = null;      //apo antha last ta null nu akirum..so last oda next entha addressum illa irukkum atha carperge collecter delete pannirum.
		else
			last.next = last.next.next; 
		return temp;
		
	}
	
	
	
}
