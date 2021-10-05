package chap05.lecture;

public class RefType {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);			//참조하는 주소값이 다르니깐..?
		System.out.println(str1.equals(str2));		//문자는 같다
	}
}
