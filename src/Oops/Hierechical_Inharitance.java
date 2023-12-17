package Oops;
class R {
    public void print_A()
    { 
    	System.out.println("Class A"); 
    	}
}
 
class J extends R {
    public void print_B()
    { 
    	System.out.println("Class B");
    	}
}
 
class O extends J {
    public void print_C() 
    { 
    	System.out.println("Class C"); 
    	}
}
 
class V extends O {
    public void print_D() 
    {
    	System.out.println("Class D"); 
    	}
}
 
// Driver Class
public class Hierechical_Inharitance {
    public static void main(String[] args)
    {
        J obj_B = new J();
        obj_B.print_A();
        obj_B.print_B();
 
        O obj_C = new O();
        obj_C.print_A();
        obj_C.print_C();
 
        V obj_D = new V();
        obj_D.print_A();
        obj_D.print_D();
    }
}
	
	
