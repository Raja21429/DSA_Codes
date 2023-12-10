package Recursive;

public class RecursiveMain {

	public static void main(String[] args) {
		RecursiveLogic recursive=new RecursiveLogic();
		String arrNew[] = {"Raja","Ramesh","Ranjith","Ragu"};
		int len=recursive.recursiveLinear(arrNew, 0);
		System.out.println(len);
	}

}
