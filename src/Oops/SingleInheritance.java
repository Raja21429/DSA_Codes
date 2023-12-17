package Oops;

	class A
{
	public void method1() {
		
		System.out.println("Method A \n Hi");
	}
}
	
	class B extends A
	{
		public void method2() {
			
			System.out.println("Method B \n Hello");
		}
}
		class C extends B{
			
			public void method3() {
				
				System.out.println("Method C \n Byee");
			}
		}
	public class SingleInheritance {
	public static void main(String[] args) {
		
		C ob = new C();
		ob.method1();
		ob.method2();
		ob.method3();

	}

}
