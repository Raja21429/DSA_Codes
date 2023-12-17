package Oops;

class X{
	
	public void eat() {
		
		System.out.println("Lion is Eating");
	}
}

class Y extends X{
	
	public void walk() {
		
		System.out.println("All Animal do that the walk");
	}
}

class Z extends Y{
	
	public void sit() {
		
		System.out.println("Animal is sitting");
	}
}

	public class Multilevel_Inheritance {
	public static void main(String[] args) {
		
		Z ob = new Z();
		ob.eat();
		ob.walk();
		ob.sit();
	}

}
