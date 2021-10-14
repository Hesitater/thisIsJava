package chap11.lecture.string;

public class A02Length {
	public static void main(String[] args) {
		String str1 = "Rachel McAdams";
		int len = str1.length();
		System.out.println(len);
		
		String s1 = str1.substring(13, 14);
		System.out.println(s1);
		
		String s2 = str1.substring(len-1, len);
		System.out.println(s2);
	}
}
