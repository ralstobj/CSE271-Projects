
public class Sorts {
	public static void main(String args[]){
		int[] arr = {1,2,3,4,6,5,7,8,9};
		selectionSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	//Greatest to least
	public static void selectionSort(int[] arr){
		int smallestPos = 0;
		
		for(int i=0; i<arr.length-1; i++){
			smallestPos = i;
			for(int j=i+1; j<arr.length; j++){
				// Change from < to > for Least to Greatest
				if(arr[smallestPos] < arr[j]){
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
}
