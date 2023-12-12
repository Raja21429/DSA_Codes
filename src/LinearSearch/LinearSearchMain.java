package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int arr[] = {1,2,3,4};
//		int target = s.nextInt();
//		System.out.println("Index " +LinearSearchArray.find(arr,target));
//		System.out.println(LinearSearchArray.contains(arr, 6));
//		
		String str = "Raja";
		System.out.println(LinearSearchArray.find(str, 'a'));
		System.out.println(LinearSearchArray.contains(str, 's'));
		
		int[][] twoDArr = {
				{2,5,3},
				{5,7,3},
				{8,3,2}
		};
		int[]result = LinearSearchArray.find(twoDArr, 7);
		System.out.println(Arrays.toString(result));
	}

}
