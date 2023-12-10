
public class Construture {
	int aadharNo,dob;
	String name,city;
	

	public Construture(String string, int i, int j, String string2) {
		name=string;
		dob=i;
		aadharNo=j;
		city=string2;
	}
	public Construture(int i) {
		aadharNo=i;
	}
	public void applyLoan() {
		
		System.out.println(name);
		//System.out.println(aadharNo);
	}
	public static void main(String[] args) {
		Construture raja=new Construture("raja",123,4567,"cbe");
		Construture ramesh=new Construture(123547345);
		
		raja.applyLoan();
	//	ramesh.applyLoan();
		

	}

}
