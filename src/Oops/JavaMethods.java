package Oops;

public class JavaMethods {
	int x = 5;
	
	//static keyword used
	public static void myName() {
		System.out.println("Raja");
	}
	
	//without argument
	public void myAge() {
		System.out.println("My Age is : 21");
	}
	
	//with argument
	public void myDob(int dob) {
		System.out.println(dob);
	}
	
	//with argument return type
	public  int myId(int n) {
		//System.out.println(n);
		return n;
	}

	public static void main(String[] args) {
		
		JavaMethods d = new JavaMethods();
		System.out.println(d.x);
		myName();
		d.myAge();
		d.myDob(19);
		System.out.println(d.myId(12));

	}

}
