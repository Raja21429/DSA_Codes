package DoubleLinked;


public class DoubleCode<T> {
	Node head;
	Node tail;
	
	class Node{
		T data;
		Node prev;
		Node next;
		
		Node(T val){
			data = val;
			prev = null;
			next = null;
		}
	}
	
	DoubleCode(){
		head=null;
		tail=null;
	}
	public void insert(T val) {
	Node newNode = new Node(val);
		newNode.next = head;        //already iruntha head than.now newnode.next
		  //when list empty
		if(head==null) {
			tail = newNode;         //also tail is null
		}
		else {
			//list is not empty
			head.prev = newNode;    //old head prev now newnode
		}
		head = newNode;             //also is head null and taillum null than..namma create pannirukarathu 1node than.athula headum irukkum taillum irukkum
						            //so 1st if la tail la kudukurom then last la head than newnode nu kudukurom
	}
	
	public void displaystraight() {
		if(head==null) {
			System.out.println("list is Empty");
		}
		Node temp = head;  //start from head
		while(temp!=null) { //null implies end of list
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	public void displayrev() {
		if(head==null) {
			System.out.println("list is Empty");
		}
		Node temp = tail;  //start from tail
		while(temp!=null) { //null implies end of list
			System.out.println(temp.data+" ");
			temp = temp.prev;
		}
	}
	public void insertpos(int pos,T val) {
		if(pos==0) {
			insert(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;             //jump to prev node
			if(temp==null) {
				throw new IndexOutOfBoundsException("Invaild pos "+pos);
			}
		}
			newNode.next = temp.next;  //temp.next la iruntha address sa newNode.next la store pantrom(next node ku link create pantrom)
			newNode.prev = temp;      //ipo vanthu temp oda address sa newnode oda prev link create pantrom
			
//			if(temp==tail) {
//				tail = newNode;
//			}
//			else {
			temp.next.prev = newNode; //tail la irunthu newnode ku link create pantrom
			temp.next = newNode;      //newnode ta temp oda next ku link create pantrom     
			//}
	}
			
			public void deleteposition(int pos) {
				if(head==null) {
					throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
				}
				
				Node temp=head;
				Node prev=null;
				
				
				for(int i=1;i<=pos;i++) {
					prev = temp;//keep track of prev node
					temp = temp.next;//jump to next node
					if(temp == null) {
						throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
					}
				}
				prev.next = temp.next;//reassign pointer
				if(temp.next == null) {   //intha condition last index sa delete pannanum na
					tail = prev;
				}
				else {
				temp.next.prev = prev;    //last index delete pannala na ithu
				}
				
			}
		
		public void delStartingNull(int pos) {
			if(head==null) {
				throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
			}
			
			if(pos==0) {
				head=head.next;
				if(head == null) {
					tail = null;
				}
				else {
					head.prev = null;
					return;
				}
			}
		}
	
}


