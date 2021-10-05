package chap02.examples.Ex;

public class PromotionExample {
	public static void main(String[] args) {
		
		// 자동 타입 변환
		// 큰 크기타입 = 작은 크기타입   우측 에서 좌측 자동 타입변환
		// byte(1) < short(2) < int(4) < long(8) < float(4)  < double(8)

		
		byte byteValue = 10;
		int intValue = byteValue;  // int ← byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;		//int ← char
		System.out.println("가의 유니코드= " + intValue);
		
		intValue = 500;
		long longValue = intValue;		// long ← int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//double ← int
		System.out.println(doubleValue);
		
		
		
		
//		byte byteValue = 10;
//		int intValue = byteValue;
//		
//		System.out.println(byteValue);
//		System.out.println(intValue);
		
//		int intValue = 200;
//		double doubleValue = intValue; //200.0
//		
//		System.out.println(intValue);
//		System.out.println(doubleValue);

//		char charValue = 'A';
//		int intValue = charValue; //65가 저장
//		
//		System.out.println(intValue);
//		System.out.println(charValue);		
		
//		byte byteValue = 65;				//65
////		char charValue = byteValue;			//컴파일에러
//		char charDate = (char) byteValue;	//강제 타입변환 A나옴
//	
//		System.out.println(byteValue);
//		System.out.println(charDate);
	
	
	}
}
