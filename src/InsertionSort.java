
public class InsertionSort {
	public static <E extends Comparable<E>> void Sort(E[] arr){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j].compareTo(arr[j-1])<0) {
					E tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}else
					break;
					
			}
		}
	}
	
	public static <E extends Comparable<E>> void Sort2(E[] arr){
		for(int nextInt=1;nextInt<arr.length;nextInt++) {
			E next = arr[nextInt];
			
			int insertIndex = nextInt;
			while(insertIndex >0 && arr[insertIndex-1].compareTo(next)>0) {
				arr[insertIndex] = arr[insertIndex-1];
				insertIndex--;
			}
			
			arr[insertIndex] = next;
			
			
		}
	}
}
