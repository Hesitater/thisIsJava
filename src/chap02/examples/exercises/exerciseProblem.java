package chap02.examples.exercises;

public class exerciseProblem {
	public static void main(String[] args) {
		
		//1번 답 4번
		
		 int i;
//		 System.out.println(i);

		 //2번 답 1,4,5
		 // 자바예약어 사용안됨, 문자앞에 $, _ 이외 안됨 숫자 안됨
		 int modelName;
//		 int class;
//		 int 6hour;
		 int $value;
		 int _age;
//		 int int;
		 
		 //3번 답 byte, short,char, int,long  , float, double, boolean
		 
		 
		 //4번 답
		 int age;
		 age = 10;
		 double price = 3.14;
		 // 타입 : (int), (double)
		 // 변수 이름 : (age), (price)
		 // 리터럴 : (10), (3.14)
		 
		 
		 // 5번답 3번
		 //char범위는 0~65535이므로 음수를 가질수가 없어서
		 //short타입은 음수 포함이라서 컴파일에러가 나온다.
		 
		 byte byteValue = 10;
		 char charValue = 'A';
		 
//		 short ShrotValue = charValue;
		 
		 
		 //6번 답  4번
		 // Cannot cast from String to char
		 // String에서 char로 컴파일 에러가 납니다
		 int intValue = 10;
		 char charValue2 = 'A';
		 double doubleValue = 5.7;
		 String strValue = "A";
		 
		 double var = (double) intValue;
		 byte var2 = (byte) intValue;
		 int var3 = (int) doubleValue;
//		 char var4 = (char) strValue;
		 
		 //7번 답 3번
		 // char에 빈문자 대입하면 컴파일 에러가남 
		 // char 초기화할대공백( 유니코드:32) 하나를 포함해야함
		 int var10 = 10;
		 long var11 = 10000000000L;
//		 char var12 = '';
		 double var13 = 10;
		 float var14 = 10;
		 
		 
		 //8번 답  1번 
		 byte byteValue21 = 10;
		 float floatValue21 = 2.5F;
		 double doubleValue21 = 2.5;
		
//		 byte result = byteValue21 + byteValue21;
		 int result2 = 5 +byteValue21 ;
		 float result3 = 5 +floatValue21;
		 double result4 = 5 + doubleValue21;
		 
		 int result5 = byteValue21 + byteValue21;
		 byte result6 = (byte) (byteValue21 + byteValue21);
		 
	}
}
