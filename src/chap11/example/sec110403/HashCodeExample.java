package chap11.example.sec110403;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "김태희");
		Student s2 = new Student(1, "김태희");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		System.out.println(Objects.hashCode(s1));
		System.out.println(s2.hashCode());
	}
	
	static class Student {
		int sno;
		String name;
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
		
	}
}
