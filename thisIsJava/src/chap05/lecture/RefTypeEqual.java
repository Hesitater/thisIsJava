package chap05.lecture;

public class RefTypeEqual {
	public static void main(String[] args) {
		// primitive type (기본 타입, 원시 타입)
		// byte, short, int, long, float, double, boolean, char
		int a = 3;

		// reference type (참조타입)
		// 기본타입 빼고 나머지 모두 다
		String s1 = "java";
		String s2 = "python";

		String s3 = "java";

		// 참조값중 null값
		s3 = null;

		s1.length();
		s3.length();		// exception 뜸
		
		System.out.println(s1);		// 출력값:java
		System.out.println(s2);		// 출력값:python
		System.out.println(s3);		// 출력값:null 

	}
}
