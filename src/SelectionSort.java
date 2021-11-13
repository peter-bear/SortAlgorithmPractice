
public class SelectionSort {
	
	public static <E extends Comparable<E>> void Sort(E[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int smallest = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[smallest]) < 0) {
					smallest = j;
				}
			}
			E tmp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = tmp;
			
		}
	}

}
