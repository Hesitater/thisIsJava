package chap11.lecture.string;

public class A01SubString {
	public static void main(String[] args) {
		String str1 = "Rachel McAdams";
		System.out.println(str1.length());
		String s1 = str1.substring(0, 4);
		System.out.println(s1);
		
		
		String s2 = str1.substring(4, 8);
		System.out.println(s2);
		
		String s3 = str1.substring(9, 14);
		System.out.println(s3);
		
	}
}
