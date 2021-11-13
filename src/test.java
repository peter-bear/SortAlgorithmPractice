import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		System.out.println("Test Start");
		Person[] people = new Person[8];
		
		initArr(people);
		System.out.println("\nSelection Sort");
		System.out.println(Arrays.toString(people));
		SelectionSort.Sort(people);
		System.out.println(Arrays.toString(people));
		
		initArr(people);
		System.out.println("\nBubble Sort");
		System.out.println(Arrays.toString(people));
		BubbleSort.Sort(people);
		System.out.println(Arrays.toString(people));
		
		initArr(people);
		System.out.println("\nBubble Sort");
		System.out.println(Arrays.toString(people));
		InsertionSort.Sort2(people);
		System.out.println(Arrays.toString(people));	
		
		initArr(people);
		System.out.println("\nMerge Sort");
		System.out.println(Arrays.toString(people));
		MergeSort.Sort(people);
		System.out.println(Arrays.toString(people));	
	}
	
	private static void initArr(Person[] people) {
		people[0] = new Person(66, "Jim");
		people[1] = new Person(20, "Steven");
		people[2] = new Person(15, "Kevin");
		people[3] = new Person(13, "Willim");
		people[4] = new Person(47, "Alex");
		people[5] = new Person(22, "Peter");
		people[6] = new Person(66, "John");
		people[7] = new Person(66, "Jim");
	}


}
