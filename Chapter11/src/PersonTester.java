
public class PersonTester {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.getAge();
		System.out.println(p1);
		
		Person p2 = new Person("Bryan", 71);
		p2.getAge();
		System.out.println(p2);
		
		Student s1 = new Student();
		System.out.println(s1);
	}
}
