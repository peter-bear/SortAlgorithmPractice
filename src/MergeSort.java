
public class MergeSort {
	public static <E extends Comparable<E>> void Sort(E[] arr) {
		
		divide(arr,createComparableArray(arr.length),0, arr.length-1);
	
	}
	
	/**
	 * Make sure the array is divided into two parts
	 * @param <E>
	 * @param arr
	 * @param tmp
	 * @param left
	 * @param right
	 */
	private static <E extends Comparable<E>> void divide(E[] arr, E[] tmp, int left, int right) {
		int pivote = (left+right)/2;
		if(left<right) {
			divide(arr, tmp, left, pivote);
			divide(arr, tmp, pivote+1, right);
			conquer(arr, tmp, left, pivote+1,right);
		}
	}
	
	/**
	 * compbine two array
	 * @param <E>
	 * @param arr
	 * @param tmp
	 * @param leftPos
	 * @param rightPos
	 * @param rightEnd
	 */
	private static <E extends Comparable<E>> void conquer(E[] arr, E[] tmp, int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos-1;
		int nums = rightEnd - leftPos+1;
		int cur = leftPos;
		while(leftPos<= leftEnd && rightPos <= rightEnd) {
			if(arr[leftPos].compareTo(arr[rightPos])<0) {
				tmp[cur++] = arr[leftPos++];
				
			}
			else if(arr[leftPos].compareTo(arr[rightPos])>0) {
				tmp[cur++] = arr[rightPos++];
			}
			else {
				tmp[cur++] = arr[leftPos++];
				tmp[cur++] = arr[rightPos++];
			}
		}
		
		while(leftPos<= leftEnd) {
			tmp[cur++] = arr[leftPos++];
		}
		
		while(rightPos<= rightEnd) {
			tmp[cur++] = arr[rightPos++];
		}
		
		//transfer object into original one
		for(int i=0;i<nums;i++, rightEnd--) {
			arr[rightEnd] = tmp[rightEnd];
		}
	}
	
	/**
	 * This helper method creates a new array of comparable elements of type E.
	 * 
	 * Java uses something called "type erasure"--basically forgetting about
	 * generic type parameters like E at runtime to save space. Because of this,
	 * the cast in this method causes a warning. By burying this warning in a
	 * helper method we can use the SuppressWarnings annotation to hide it
	 * without worrying about hiding any other warnings.
	 * 
	 * @param <E>
	 *            the type of elements in the arrays, which must be comparable
	 *            to each other
	 * 
	 * @param len
	 * @return a new array of the given length
	 */
	@SuppressWarnings("unchecked")
	private static <E extends Comparable<E>> E[] createComparableArray(int len) {
		return (E[]) new Comparable[len];
	}
}
