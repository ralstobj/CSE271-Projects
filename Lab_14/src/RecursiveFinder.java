
public class RecursiveFinder {

	public static int largestElement(int[] arr, int s, int e){
		int l = e-s+1;
		if(l ==1){
			return arr[e];
		}
		int n = arr[e];
		if(n < arr[s]){
			return largestElement(arr, s, e-1);
		}else{
			return largestElement(arr, s+1, e);
		}
		
	}
	public static String reverser(String str){
		
		if(str.length()-1==0){
			return str;
		}
		char first = str.charAt(0);
		return reverser(str.substring(1))+first;
		
	}
	
	public static void main(String args[]){
		int[] arr= {1,2,3,5,24,6,9,9, -1, 3,7};
		System.out.println(largestElement(arr,0,arr.length-1));
		String test1 = "american";
		String test2 = "hi";
		String test3 = "hello";
		System.out.println(reverser(test1));
		System.out.println(reverser(test2));
		System.out.println(reverser(test3));
	}
}
