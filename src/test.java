import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		System.out.println("Test Start");
		Person[] people = new Person[8];
		people[0] = new Person(66, "Jim");
		people[1] = new Person(20, "Steven");
		people[2] = new Person(15, "Kevin");
		people[3] = new Person(13, "Willim");
		people[4] = new Person(47, "Alex");
		people[5] = new Person(22, "Peter");
		people[6] = new Person(66, "John");
		people[7] = new Person(66, "Jim");
		System.out.println(Arrays.toString(people));
		SelectionSort.Sort(people);
		System.out.println(Arrays.toString(people));
	}

}
