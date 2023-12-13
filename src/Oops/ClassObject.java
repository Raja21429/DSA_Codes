package Oops;

public class ClassObject {
	int x =5;
	static int y;
	
	public static void main(String[] args) {
		y=5;
		ClassObject b = new ClassObject();
		ClassObject a = new ClassObject();
		System.out.println(b.x);
		System.out.println(a.x);
	}
}
