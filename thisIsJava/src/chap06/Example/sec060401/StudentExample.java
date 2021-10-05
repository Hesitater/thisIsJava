package chap06.Example.sec060401;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Studnet 객체를 참조합니다.");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));	//identityHashCode : Object의 hashcode 리턴해줌
		System.out.println(System.identityHashCode(s2));
	}
}
