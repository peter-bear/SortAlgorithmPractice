
public class Person implements Comparable{
	private int age;
	private String name;
	
	Person(int a, String n){
		this.age = a;
		this.name = n;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+this.name+" : "+this.age+"]";
	}


	/**
	 * Compare age first, if age equal, compare their name
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person b = (Person) o;
		if(this.age == b.age)
			return compareName(this.name.toCharArray(),b.name.toCharArray(),0);
		return this.age - b.age;
	}
	
	
	private int compareName(char[] a, char[] b, int index) {
		if(a.length <= index)
			return -1;
		else if(b.length <= index)
			return 1;
		else if(a.length <= index && b.length <= index)
			return 1;
		
		if(a[index] == b[index])
			return compareName(a, b, index+1);
		else
			return a[index] - b[index];
	}
	
	
}
