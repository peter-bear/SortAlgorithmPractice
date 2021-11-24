
public class QuickSort {
	public static <E extends Comparable<E>> void Sort(E[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static <E extends Comparable<E>> void swap(E[] arr, int i, int j) {
		E tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	private static <E extends Comparable<E>> int partition(E[] arr, int low, int high) {
		E pivot = arr[high];
		
		int i = low-1;
		for(int j= low;j<high;j++) {
			if(arr[j].compareTo(pivot)<0) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,high);
		return i+1;
	}
	
	private static <E extends Comparable<E>> void quickSort(E[] arr, int low, int high) {
		if(low<high) {
			int pi = partition(arr,low,high);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
}
