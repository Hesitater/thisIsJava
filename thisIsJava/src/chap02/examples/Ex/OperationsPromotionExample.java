package chap02.examples.Ex;

public class OperationsPromotionExample {
	public static void main(String[] args) {

		// 연산식에서 자동 타입 변환
		// 큰쪽을 따라간다
		// int전까지는 int로  int보다 큰건 큰쪽을 따라감
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); //30
		
		char charValue1 = 'A';		// 66이기떄문에
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드= " + intValue2);			// 66
		System.out.println("출력문자= " + (char)intValue2 );	// B
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);	//2
		
		int intValue5 = 10;
//		int intValue6 = 10 /4.0 ; // 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);	// 2.5
		
		
		
	
//		int intValue = 10;
//		double doubleValue = 5.5;
//		double result = intValue + doubleValue; // result 에 15.5가 저장
//		System.out.println(result);
//
//		int result01 = intValue + (int) doubleValue; // result 15가 저장
//		System.out.println(result01);
//		
//		char ai ='A';
//		int result02 = ai +1;		 // 'A' 의 유니코드보다 1이 큰 유니코드가 저장
//		char na = (char) result; 	//'B'가 저장됨
//		
//		System.out.println(result02);
	
	
	}
}
