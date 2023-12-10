
public class RecursiveLogic {
	public int recursiveLinear(String arr[],int len) {
		
		System.out.println(len);
		if(arr.length==len) {
			return len;
		}
		len=len+1;
		len=recursiveLinear(arr,len);
		System.out.println("Output :" +len);
		return len;
		
	}
}
