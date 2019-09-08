
public class QuickSort {
	
	public static void main(String args[]){
		int[] test = {1,7,3,324,76,5,22};
		quickSort(test,0,test.length-1);
		for(int i = 0; i<test.length; i++){
			System.out.print(test[i] + " ");
		}
	}
	
	public static void quickSort(int[] arr, int s, int e){
		if(s>=e){return;}	
		int p = partition(arr,s,e);
			quickSort(arr, p+1,e);
			quickSort(arr, s,p-1);
	
		
	}
	
	public static int partition(int[] arr, int s, int e){
		int pivot = 0;
		if(arr[s] > arr[(s+e)/2] && arr[s]<arr[e]){
			pivot = s;
		}else if(arr[s]<arr[(s+e)/2] && arr[(s+e)/2] <arr[e]){
			pivot = (s+e)/2;
		}else if(arr[(s+e)/2] < arr[e] && arr[e] < arr[s]){
			pivot = e;
		}
		swap(arr,pivot, e);
		
		int i = s;
		int j = e-1;
		while(true){
			while(arr[i]<arr[e] && i<e){
				i++;
			}while(arr[j]>=arr[e] && j >s){
				j--;
			}
			if(i>=j){
				break;
			}
			swap(arr, i,j);
		}
		swap(arr, i, e);
		return i;
	}
	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
