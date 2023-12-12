package LinearSearch;

public class LinearSearchArray {
	private static boolean flase;
	private static boolean ture;


	public static int find(int[] arr,int target) {
		
		//using number
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	//antha valueirukka illaya nu confirm pantrathuku
	public static boolean contains(int[] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return ture;
				
			}
		}
	
		return flase;
		
	}
	
	
	//using string
	public static int find(String str,char target) {
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == target) {
				return i;
				
			}
		}
		return -1;
		
	}
public static boolean contains(String str,char target) {
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == target) {
				return true;
				
			}
		}
		return false;
	
		
		
	}

public static int[] find(int[][] twoDArr, int target) {
	
		for(int i=0;i<twoDArr.length;i++) {
			for(int j=0;j<twoDArr[i].length;j++) {
				if(twoDArr[i][j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
}
	
	
	
}
