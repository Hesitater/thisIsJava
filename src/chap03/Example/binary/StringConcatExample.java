package chap03.Example.binary;

public class StringConcatExample {
	public static void main(String[] args) {
		

		String str1 = "JDK" + 6.0;		// "JDK6.0" 이 저장 
		String str2 = str1 + " 특징";	// "JDK6.0 특징" 이 저장
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;	// "JDK33.0" 이 저장
		String str4 = 3 + 3.0 + "JDK";	// "6.0JDK" 이 저장  3+3.0이 먼저 계산 
		System.out.println(str3);		
		System.out.println(str4);		
		
	}
}
