import java.util.Scanner;

public class Lineary_Search {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("Enter the Value :");
		int key=s.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Element index position :"+i);
				flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println("Invaild input");
			
		}
	}

}
