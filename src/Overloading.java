
public class Overloading {
    
	public static int  add(int a,int b){
		int c=a+b;
		
		 return c;
		}  
	public void add(int d){
		 d=d+11;
		System.out.println(d);
		}  
	public static int add(int a,int b,int c,int d) {   // method overloading and constructure overloading
		int e=a+b+c+d;
		return e;
		
	}
	 
	
	public static void main(String[] args){  
	Overloading overloading = new Overloading();
	int v=overloading.add(11, 11);  
	System.out.println(v);
	overloading.add(v); 
	System.out.println(Overloading.add(11,11,11,11)); 
	} 

}
