package LinkedList;

public class LinkedCode {
	Node head;
	
	class Node{
		int data;
		Node next;
		 Node(int val){  //constructure vanthu value initialization pantrathuku than
				data = val;
				next = null;
	}
	  
	}
	
	LinkedCode(){
		head=null;
	}
	
	public void insert(int val) {
		Node newNode = new Node(val);
		if(head==null) {   //when is empty
			head=newNode;
		}
		else {   
			//list is not emty
			newNode.next = head;   //ithu already entha node head ah iruthucho
			head=newNode;          //athu than ipo newNode oda next(pointer).
		}
	}
	
	public void display() {
		Node temp=head;   //start from head
		while(temp!=null) {           //temp vanthu null la illatha vara loop run akunu condition kuduthurukom
			System.out.print(temp.data+ " ");
			temp=temp.next;            //jump (node oda next tayum temp la store panni vacha than jump akum
		}
	}
	public void insertpos(int pos,int val) {
		if(pos==0) {
			insert(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
			if(temp==null) {
				throw new IndexOutOfBoundsException("Invaild pos "+pos);
			}
		}
		
		newNode.next = temp.next;          //1st<-(V.I)--temp.next la irukku address sa newNode.next la assign pantrom(so link create panniyachu)
		temp.next = newNode;               //2nd<-(V.I)--newNode address sa temp.next assign pantrom(so ithukum link create panniyachu)
		}
		
		public void deletepos(int pos) {
			if(head==null) {
				throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
			}
			if(pos==0) {
				head=head.next;   //ipo 0pos delete pannanum na head.next la adutha newnode oda address irukkum so newnode than head akidu 0 pos sa delete pannirum. 
				return;
			}
			
			Node temp=head;
			Node prev=null;
			
			//delete akura(index--(node)) vera node ku
			jump panna for loop use pantrom
			//namma delete akanum nu soltra node la crt ah nikkum
			for(int i=1;i<=pos;i++) {
				prev = temp;//keep track of prev node
				temp = temp.next;//jump to next node
			}
			prev.next = temp.next;//reassign pointer
			
		}
		
	
}



