
public class BubbleSort {
	/**
	 * Put largest to the end
	 * @param <E>
	 * @param arr
	 */
	public static <E extends Comparable<E>> void Sort(E[] arr) {
		boolean changeArr = false;
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					E tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					changeArr = true;
				}
			}
			if(!changeArr)
				break;
			else
				changeArr = false;
		}
	}

}
