package Recursive;

public class RecursiveFactorial {
//	static int fact(int n) {
//		if(n==0)
//			return 1;
//		return n*fact(n-1);
//	}
//	public static void main(String[] args) {
//		//int n=5;
//		System.out.println(fact(5));
//	}

	 public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
		  }
	 public static void main(String[] args) {
		    int result = sum(10);
		    System.out.println(result);
		  }
		 
}
