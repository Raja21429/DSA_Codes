package CircularLinked;

public class CircularMain {

	public static void main(String[] args) {
		CircularCode<String> circular = new CircularCode<String>();
		circular.insertStarting("Ranjith");
		circular.insertStarting("Ramesh");
		circular.insertStarting("Raja");
		
		circular.display();
		circular.deleteStarting();
		circular.display();
		
//		System.out.println("");
//		circular.insertLast("perumal");
//		circular.display();
	}
	

}
