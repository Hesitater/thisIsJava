package chap02.examples.Ex;

public class CastingExample {
	public static void main(String[] args) {
		
		
		// 강제 타입 변환
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		int value = (int) longValue;
		System.out.println(value);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		
		
		//작은크기타입 = (작은크기타입) 큰 크기 타입
		
//		int intValue = 103029770;
//		byte byteValue = (byte) intValue; // 강제 타입 변환 (캐스팅)
//		System.out.println(byteValue);

		
//		long longValue = 300;
//		int intValue = (int) longValue;		// intValue는 300이 그대로 저장된다.
//		System.out.println(intValue);
		
//		int intValue = 'A';
//		char charValue = (char) intValue;
//		System.out.println(charValue);
		
//		double doubleValue = 3.14;
//		int intValue = (int) doubleValue;	//intValue는 정수 부분인 3만 저장된다.
//		System.out.println(intValue);
		
		
		
	}
}
