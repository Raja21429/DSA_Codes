package DoubleLinked;

public class DoubleMain {

	public static void main(String[] args) {
		
		DoubleCode<Integer> dou = new DoubleCode<Integer>();
		dou.insert(3);
		dou.insert(5);
		dou.insert(7);
		dou.insert(9);
		
		dou.displaystraight();
		System.out.println("");
		dou.displayrev();
		
		dou.deleteposition(3);
		
		
		System.out.println("");
		//dou.insertpos(2, 10);
		dou.displaystraight();
		System.out.println("");
		dou.displayrev();

	}

}
