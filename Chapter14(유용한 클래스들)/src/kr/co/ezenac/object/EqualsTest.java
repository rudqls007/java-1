package kr.co.ezenac.object;


public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student(2022, "Ezen");
		Student student2 = new Student(2022, "Ezen");
		
		Student student3 = (Student)student.clone();
	
		
		System.out.println(student == student2);
		System.out.println(student.equals(student2));
		System.out.println(student.equals(student3));
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println();
		
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();

		Integer integer = new Integer(100);
		Integer integer2 = new Integer(100);
		
		System.out.println(integer.equals(integer2));
		System.out.println(integer.hashCode());
		System.out.println(integer2.hashCode());
		
		System.out.println();
		System.out.println(System.identityHashCode(integer));
		System.out.println(System.identityHashCode(integer2));
	}

}
