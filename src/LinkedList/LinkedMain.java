package LinkedList;

public class LinkedMain {

	public static void main(String[] args) {
		LinkedCode list = new LinkedCode();
		//list.deletepos(1); 
		list.insert(5);
		list.insert(7);
		list.insert(9);
		list.display();
		
		System.out.println("");
//		list.insertpos(2, 10);      o.p-->9 7 10 5 
//		list.insertpos(0, 10);      antha if condition 0 position val assign ku reason
//		list.display();             o.p-->10 9 7 5 
//		
		list.deletepos(0);          //9 7 5
		list.display();            //9 5-->position 1 than 7.so delete the 7.
	}

}
