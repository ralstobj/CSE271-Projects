
public class binarySearch {
	
	public static boolean search(int[] arr, int finding){
		int l = 0;
		int h = arr.length;
		int m;
		while(l<=h){
			m= (h+l)/2;
			if(finding == arr[m]){
				return true;
			}else if(finding>arr[m]){
				l = m+1;
			}else if(finding<arr[m]){
				h= m-1;
			}
		}
		return false;
	}
	public static boolean recursiveSearch(int[]arr,int h, int l, int finding){
		int m = (h+l)/2;
		if(l>h){
			return false;
		}
		if(finding == arr[m]){
			return true;
		}else if(finding > arr[m]){
			return recursiveSearch(arr,h,m+1,finding);
		}else{
			return recursiveSearch(arr,m-1,l,finding);
		}
	}
	
	public static void selectionSort(int[] arr){
		int smallestPos = 0;
		
		for(int i=0; i<arr.length-1; i++){
			smallestPos = i;
			for(int j=i+1; j<arr.length; j++){
				// Change from < to > for Least to Greatest
				if(arr[smallestPos] > arr[j]){
					smallestPos = j;
				}
			}
			swap(arr, i, smallestPos);
		}
	}
	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void main(String args[]){
		int[] arr = {3,4,5,76,234,1,45,32};
		selectionSort(arr);
		System.out.println(search(arr,1));
		System.out.println(recursiveSearch(arr,arr.length,0,1));
	}
}
